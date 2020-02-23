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


    /**
     * Cette fonction doit retourner l'éleve si trouvé sinon elle retourne null
     * @param nom
     * @param prenom
     * @return
     */
    public static ArrayList<Eleve> existEleve(String nom, String prenom) {
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
        } catch (SQLException e){
            return null;
        }
        return  DBUtils.getEleveByName(c,nom,prenom);
    }

    public static ArrayList<Eleve> getEleveLate(String jour){
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
        } catch (SQLException e){
            return null;
        }
        return DBUtils.getElevesLate(c,jour);

    }
    public static ArrayList<Eleve> getEleveAbs(String jour){
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
        } catch (SQLException e){
            return null;
        }
        return DBUtils.getElevesABS(c,jour);


    }
}
