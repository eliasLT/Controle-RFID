package fr.newton.controlrfid.controller.backuptodelete;


import fr.newton.controlrfid.controller.RequestHandler;
import websocket4j.server.WebSocket;

import java.io.IOException;

public class SocketConnectionBackup extends Thread {
    private WebSocket ws;

    public SocketConnectionBackup(WebSocket ws) {
        this.ws = ws;
    }


    public void run() {
        String response;
        String request;
        while (true) {
            try {
                request = ws.getMessage();
                switch (this.ws.getRequestUri()){
                    case "/eleve" :
                        response = RequestHandler.handleCheckEleve(request);
                        ws.sendMessage(response);
                        break;
                    case "/eleve/retard":
                        response = RequestHandler.getEleveLate(request);
                        ws.sendMessage(response);
                        break;
                    case "/eleve/absent":
                        response = RequestHandler.getEleveAbs(request);
                        ws.sendMessage(response);
                        break;
                    case "/eleve/emploi":
                        response = RequestHandler.getSchedule(request);
                        ws.sendMessage(response);
                        break;
                    case "/eleve/insert":
                        response = RequestHandler.inserteleve(request);
                        ws.sendMessage(response);
                        break;
                    case "/horaire/insert":
                        response = RequestHandler.inserthoraire(request);
                        ws.sendMessage(response);
                        break;
                    case "/exit" :
                        this.ws.close();
                        return;
                    default:
                        this.ws.sendMessage(RequestHandler.getUnhandledResponse());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
//Bonjour,
//Je m'exuse  pour l'attente de ma reponse. J'etais en train de suivre un cursus(en periode d'examen) et donc pas fais attention au message.
//Mais après avoir lu votre message en effet je suis interresse mais pas par consulting mais plus precisement le developpement
//Mais vu que je compte continue mais etude j'aimerai bien effecuter le poste en alternance