package fr.newton.controlrfid.model.services;

import fr.newton.controlrfid.model.bdd.DBConnexion;
import fr.newton.controlrfid.model.bdd.DBUtils;
import fr.newton.controlrfid.model.structures.Eleve;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class EleveServices {
    public static ArrayList<Eleve> getElevesLate(){
        Connection c = null;
        try {
            c = DBConnexion.getMySQLConnection();
            String jour = "Lundi";
            ArrayList<Eleve> res = DBUtils.getElevesLate(c, jour);
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
