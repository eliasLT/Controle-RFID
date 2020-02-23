package fr.newton.controlrfid.controller;


import websocket4j.server.WebSocket;

import java.io.IOException;

public class SocketConnection extends Thread {
    private WebSocket ws;

    public SocketConnection(WebSocket ws) {
        this.ws = ws;
    }


    public void run() {
        String response;
        String request;
        while (true) {
            try {
                switch (this.ws.getRequestUri()){
                    case "/eleve" :
                        request = ws.getMessage();
                        response = RequestInterpreter.handleCheckEleve(request);
                        ws.sendMessage(response);
                        break;
                    case "/eleve/retard":
                        request  = ws.getMessage();
                        response = RequestInterpreter.getEleveLate(request);
                        ws.sendMessage(response);
                        break;
                    case "/eleve/absent":
                        request  = ws.getMessage();
                        response = RequestInterpreter.getEleveAbs(request);
                        ws.sendMessage(response);
                        break;
                    case "/exit" :
                        this.ws.close();
                        return;
                    default:
                        this.ws.sendMessage(RequestInterpreter.getUnhandledResponse());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
