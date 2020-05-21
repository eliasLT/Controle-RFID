package fr.newton.controlrfid.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class RequestInterpreter {

    private static final GsonBuilder builder = new GsonBuilder();
    private static final Gson gson = builder.create();

    public static Request getRequest(String req){
        try{
            return gson.fromJson(req, Request.class);
        } catch (JsonSyntaxException ex){
            return new Request("/error", new JsonObject());
        }
    }

//    public static void main(String[] args) {
////        Request res = getRequest("{"url": "/lecteur", "message": {"heure": "2020-05-14 12:29:40.069310", "uid": "47 26 72 38"}}");
//            Request res = getRequest("{\n" +
//                    "    \"url\": \"/lecteur\",\n" +
//                    "    \"message\": {\n" +
//                    "        \"uid\": \"07 31....\",\n" +
//                    "        \"heure\": \"21:30.\"\n" +
//                    "    }\n" +
//                    "}");
//
//        System.out.println(res);
//    }
}
