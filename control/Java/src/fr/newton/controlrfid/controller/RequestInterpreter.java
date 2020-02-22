package fr.newton.controlrfid.controller;

import com.juancavallotti.websockets4j.WebSocket;
import fr.newton.controlrfid.model.services.EleveServices;
import fr.newton.controlrfid.model.services.RetardServices;
import fr.newton.controlrfid.model.structures.Eleve;

import java.util.ArrayList;

public class RequestInterpreter {

    public void handleRequestLateStudent(ArrayList<String> args){
        // on lit les arguments
        //
        ArrayList<Eleve> lateStudents = EleveServices.getElevesLate();
        RetardServices.registerLateStudents(lateStudents);
        
        // renvoyer une réponse
    }
}
