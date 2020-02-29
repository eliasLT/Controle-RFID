package fr.newton.controlrfid.model.services;

import fr.newton.controlrfid.model.bdd.DBConnexion;
import fr.newton.controlrfid.model.bdd.DBUtils;
import fr.newton.controlrfid.model.structures.Eleve;
import fr.newton.controlrfid.model.structures.HoraireCours;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class EleveServices {

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

    public static ArrayList<Eleve> getElevesLate(String jour){
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
        } catch (SQLException e){
            return null;
        }
        return DBUtils.getElevesLate(c,jour);

    }

    public static ArrayList<Eleve> getElevesAbs(String jour){
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
        } catch (SQLException e){
            return null;
        }
        return DBUtils.getElevesABS(c,jour);


    }

    public static ArrayList<HoraireCours> getSchedule(String nom, String prenom) {
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
        } catch (SQLException e){
            return null;
        }
        return  DBUtils.getSchedule(c,nom,prenom);

    }

    public static boolean insertEleve(String nom, String prenom, String photo,String classe) {
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
            return  DBUtils.insertEleve(c,nom,prenom,photo,classe);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean insertHoraire(String jour,String Hdebut,String hFin, String classe, String prof){
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
            return  DBUtils.InsertHoraire(c,jour,Hdebut,hFin,classe,prof);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }


}
