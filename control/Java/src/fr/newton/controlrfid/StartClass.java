package fr.newton.controlrfid;

import fr.newton.controlrfid.controller.Serveur;

import java.io.IOException;

public class StartClass {
    public static void main(String[] args) throws IOException {
        Serveur serveur = new Serveur(5555);
        serveur.start();
        // find a way to stop serveur
    }

}
