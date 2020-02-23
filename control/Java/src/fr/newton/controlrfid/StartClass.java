package fr.newton.controlrfid;

import fr.newton.controlrfid.controller.Serveur;
import fr.newton.controlrfid.controller.SocketConnection;
import websocket4j.server.WebServerSocket;
import websocket4j.server.WebSocket;

import java.io.IOException;

public class StartClass {
    public static void main(String[] args) throws IOException, InterruptedException {
        Serveur serveur = new Serveur(5555);
        serveur.start();
        serveur.join();
    }

}
