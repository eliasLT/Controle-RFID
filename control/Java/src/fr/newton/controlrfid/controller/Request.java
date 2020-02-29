package fr.newton.controlrfid.controller;

import com.google.gson.JsonObject;

public class Request {
    private String url;
    private JsonObject message;

    public Request(String url, JsonObject message) {
        this.url = url;
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public JsonObject getMessage() {
        return message;
    }

    public void setMessage(JsonObject message) {
        this.message = message;
    }
}
