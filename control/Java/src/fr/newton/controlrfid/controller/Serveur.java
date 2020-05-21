package fr.newton.controlrfid.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.io.IOException;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class Serveur extends WebSocketServer {
    //Used vector to garantee thread-safety for multiple connections
    private List<WebSocket> toSend = new Vector<>();
    public Serveur(int port) throws UnknownHostException {
        super(new InetSocketAddress(port));
    }


    public Serveur(InetSocketAddress address) throws UnknownHostException {
        super(address);
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake ) {
        conn.send("Welcome to the server!"); //This method sends a message to the new client
        System.out.println("elias");
    }

    @Override
    public void onClose( WebSocket conn, int code, String reason, boolean remote ) {
        conn.send("connection closed");
    }
//arraylist de conn
    @Override//surcharger la méthode deja méthode s'appellant onMessage redefiniton
    public void onMessage( WebSocket conn, String message ) {
        System.out.println("####################");
        Request req = RequestInterpreter.getRequest(message);
        String response;
        String request = req.getMessage().toString();
        System.out.println("request handled with on message method | req : " + req.getUrl() + " | message : " + request);
        switch (req.getUrl()){
            case "/eleve" :
                response = RequestHandler.handleCheckEleve(request);
                break;
            case "/eleve/retard":
                response = RequestHandler.getEleveLate(request);
                break;
            case "/eleve/absent":
                response = RequestHandler.getEleveAbs(request);
                break;
            case "/eleve/emploi":
                response = RequestHandler.getSchedule(request);
                break;
            case "/eleve/insert":
                response = RequestHandler.inserteleve(request);
                break;
            case "/horaire/insert":
                response = RequestHandler.inserthoraire(request);
                break;
//            case "/entre/eleve":
//                response = request;
//                break;
            case "/listen":
                if(! toSend.contains(conn)){

                    toSend.add(conn);
                }
                response = "+1";
                break;
            case "/lecteur":
                response = RequestHandler.insertEntreEleve(request);
                for(WebSocket ws : toSend){
                    String jsres = RequestHandler.retreiveDataEleveFromLecteur(request);
                    ws.send(jsres);
                }
                System.out.println(response);
                break;
            case "/exit" :
                try {
                    this.stop();
                } catch (IOException | InterruptedException ignored) {}
                return;
            default:
                response = RequestHandler.getUnhandledResponse();
        }
        conn.send(response);
    }

    @Override
    public void onMessage( WebSocket conn, ByteBuffer message ) {
        byte[] bytes = message.array();
        String req = new String(bytes, StandardCharsets.UTF_8);
       onMessage(conn, req);
    }

    @Override
    public void onError( WebSocket conn, Exception ex ) {
        ex.printStackTrace();
    }

    @Override
    public void onStart() {
        System.out.println("Server started!");
//        setConnectionLostTimeout(0);
//        setConnectionLostTimeout(100);
    }




}
