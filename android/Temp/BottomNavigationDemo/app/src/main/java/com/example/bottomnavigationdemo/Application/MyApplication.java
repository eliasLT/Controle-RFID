package com.example.bottomnavigationdemo.Application;

import android.app.Application;
import org.java_websocket.client.WebSocketClient;
import java.net.URI;
import java.net.URISyntaxException;


public class MyApplication extends Application {
    private WebSocketClient socketClient;

    public MyApplication() {
        super();
//        try{
//            String adresse = "ws://localhost:5555";
//            this.socketClient = new WebSocketClient(new URI(adresse));
//            this.socketClient.connect();
//        }catch (URISyntaxException e) {
//            e.printStackTrace();
//            }
        }

//    public  WebSocketClient getSocketClient() {
//        return socketClient;
//    }
}

