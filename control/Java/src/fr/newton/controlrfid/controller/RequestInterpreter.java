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
}
