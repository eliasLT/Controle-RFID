package fr.newton.controlrfid.controller.backuptodelete;

import websocket4j.server.WebServerSocket;
import websocket4j.server.WebSocket;

import java.io.IOException;

public class ServeurBackup extends Thread {
    private WebServerSocket serverSocket;
    private final int port;

    public ServeurBackup(int port) throws IOException {
        this.port = port;
        this.serverSocket = new WebServerSocket(port);
    }

    @Override
    public void run() {
        try {
            while (true) {
                WebSocket ws = null;
                ws = serverSocket.accept();
                (new SocketConnectionBackup(ws)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                System.out.println("Impossible de fermer le socket");
            }
        }
    }
}
