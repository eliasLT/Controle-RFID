package fr.newton.controlrfid.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import websocket4j.client.WebSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

        public static void main(String[] args) throws IOException {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            WebSocket ws = new WebSocket("localhost", 5555, "/horaire/insert");
            JsonObject test = new JsonObject();
            test.addProperty("classe", "SAR");
            test.addProperty("HD", "18:00:00");
            test.addProperty("HF", "19:00:00");
            test.addProperty("prof", "Kaneki");
            test.addProperty("jour", "vendredi");
            String message = gson.toJson(test);
            ws.sendMessage(message);
            System.out.println("Response: " + ws.getMessage());
            ws.close();
        }

    }

