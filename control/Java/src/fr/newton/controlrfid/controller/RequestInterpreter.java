package fr.newton.controlrfid.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import fr.newton.controlrfid.model.services.EleveServices;
import fr.newton.controlrfid.model.services.RetardServices;
import fr.newton.controlrfid.model.structures.Eleve;
import fr.newton.controlrfid.model.structures.HoraireCours;

import java.util.ArrayList;


/**
 *
 */
public class RequestInterpreter {

    private static final GsonBuilder builder = new GsonBuilder();
    private static final Gson gson = builder.create();


    public static String handleCheckEleve(String request) {
        Eleve eleve;
        try {
            eleve = gson.fromJson(request, Eleve.class);
        } catch (JsonSyntaxException e){
            return gson.toJson(
                    getErrorResponse("Could not parse the request")
            );
        }
        if( eleve.getNom() == null || eleve.getPrenom() == null){
            return gson.toJson(
                    getErrorResponse("Missing nom or prenom parameter")
            );
        }
        ArrayList<Eleve> eleves = EleveServices.existEleve(eleve.getNom(), eleve.getPrenom());
        if(eleves.size() == 0){
            return gson.toJson(
                    getErrorResponse("Eleve does not exist")
            );
        }
        JsonObject res = getSuccessResponse();
        res.add("eleves", gson.toJsonTree(eleves));
        return gson.toJson(res);
    }

    /**
     * 
     * @param request
     * @return
     */
    public static String getEleveLate(String request) {
        HoraireCours horaire;
        try {
            horaire = gson.fromJson(request, HoraireCours.class);
        } catch (JsonSyntaxException e){
            return gson.toJson(
                    getErrorResponse("Could not parse the request")
            );
        }
        if(horaire.getJour()  == null ){
            return gson.toJson(
                    getErrorResponse("Missing jour parameter")
            );
        }
        ArrayList<Eleve> eleves = EleveServices.getEleveLate(horaire.getJour());
        JsonObject res = getSuccessResponse();
        res.add("eleves", gson.toJsonTree(eleves));
        return gson.toJson(res);

    }

    public static String getEleveAbs(String request) {
        HoraireCours horaire;
        try {
            horaire = gson.fromJson(request, HoraireCours.class);
        } catch (JsonSyntaxException e){
            return gson.toJson(
                    getErrorResponse("Could not parse the request")
            );
        }
        if(horaire.getJour()  == null ){
            return gson.toJson(
                    getErrorResponse("Missing jour parameter")
            );
        }
        ArrayList<Eleve> eleves = EleveServices.getEleveAbs(horaire.getJour());
        JsonObject res = getSuccessResponse();
        res.add("eleves", gson.toJsonTree(eleves));
        return gson.toJson(res);

    }

    // ===================================================================================================

    //                                          Utilities

    // ===================================================================================================


    private static JsonObject getSuccessResponse() {
        JsonObject res =  new JsonObject();
        res.addProperty("status", "success");
        return res;
    }

    private static JsonObject getErrorResponse() {
        JsonObject res =  new JsonObject();
        res.addProperty("status", "error");
        return res;
    }

    private static JsonObject getErrorResponse(String message) {
        JsonObject res =  new JsonObject();
        res.addProperty("status", "error");
        res.addProperty("message", message);
        return res;
    }


    public static String getUnhandledResponse() {
        JsonObject res =  new JsonObject();
        res.addProperty("status", "error");
        res.addProperty("message", "Unhandled request");
        return gson.toJson(res);
    }
}
