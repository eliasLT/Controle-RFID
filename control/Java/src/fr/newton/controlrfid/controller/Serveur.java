package fr.newton.controlrfid.controller;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class Serveur extends WebSocketServer {

    public Serveur(int port) throws UnknownHostException {
        super(new InetSocketAddress(port));
    }

    public Serveur(InetSocketAddress address) throws UnknownHostException {
        super(address);
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake ) {
        conn.send("Welcome to the server!"); //This method sends a message to the new client
    }

    @Override
    public void onClose( WebSocket conn, int code, String reason, boolean remote ) {
        conn.send("connection closed");
    }

    @Override
    public void onMessage( WebSocket conn, String message ) {
        Request req = RequestInterpreter.getRequest(message);
        String response;
        String request = req.getMessage().toString();
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
        setConnectionLostTimeout(0);
        setConnectionLostTimeout(100);
    }


}
