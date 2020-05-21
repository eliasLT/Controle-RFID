package fr.newton.controlrfid.model.services;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import fr.newton.controlrfid.beans.EntreeParser;
import fr.newton.controlrfid.model.bdd.DBConnexion;
import fr.newton.controlrfid.model.bdd.DBUtils;
import fr.newton.controlrfid.model.structures.Eleve;
import fr.newton.controlrfid.model.structures.EntreeEleve;
import fr.newton.controlrfid.model.structures.HoraireCours;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        } catch (SQLException | IOException e){
            return null;
        }
        return  DBUtils.getEleveByName(c,nom,prenom);
    }

    public static ArrayList<Eleve> getElevesLate(String jour){
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
        } catch (SQLException | IOException e){
            return null;
        }
        return DBUtils.getElevesLate(c,jour);

    }

    public static ArrayList<Eleve> getElevesAbs(String jour){
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
        } catch (SQLException | IOException e){
            return null;
        }
        return DBUtils.getElevesABS(c,jour);


    }

    public static ArrayList<HoraireCours> getSchedule(String nom, String prenom) {
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
        } catch (SQLException | IOException e){
            return null;
        }
        return  DBUtils.getSchedule(c,nom,prenom);

    }

    public static boolean insertEleve(String nom, String prenom, String photo,String classe) {
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
            return  DBUtils.insertEleve(c,nom,prenom,photo,classe);
        } catch (SQLException | IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean insertHoraire(String jour,String Hdebut,String hFin, String classe, String prof){
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
            return  DBUtils.InsertHoraire(c,jour,Hdebut,hFin,classe,prof);
        } catch (SQLException | IOException e) {
            e.printStackTrace();
            return false;
        }

    }
    public static boolean insertEntreeEleve(){
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
            ArrayList<EntreeEleve> entrer = EntreeParser.parseEntreeEleveFile("test.txt");
            boolean res = true;
            for (int i = 0; i < entrer.size(); i++) {
                EntreeEleve ee = entrer.get(i);
                res = res && DBUtils.insertEntreEleve(c ,ee.getIdEleve(),ee.getHeureArrive());
            }
            return res;
        } catch (SQLException | IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean insertEntreeEleve(String uid , String heureArriver) {
        Connection c;

        try {
            c = DBConnexion.getMySQLConnection();
            System.out.println("test " + uid);
            return DBUtils.insertEntreEleve(c, uid, heureArriver);

        } catch (SQLException | IOException e) {
            e.printStackTrace();

            return false;
        }

    }


//
//    public static boolean insertcarte(String nom , String prenom){
//        Connection c;
//        try{
//            c = DBConnexion.getMySQLConnection();
//            String uid = ReadUidFromCarte();
//            return DBUtils.insertCarte(c, uid,nom,prenom);
//        } catch (SQLException | IOException | InterruptedException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }

    public static String ReadUidFromCarte() throws IOException, InterruptedException {
        String[] cmd = {"/home/elias/Bureau/temp.py"};
        Process p = Runtime.getRuntime().exec(cmd);
        p.waitFor();

        String line = "";
        java.lang.String output = "";
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = br.readLine())!= null) {sb = sb.append(line).append("\n"); }

        output = sb.toString();

        return output;
    }

    public static String retreiveEleveDataFromLecteur(String uid) {
        Connection c;
        try {
            c = DBConnexion.getMySQLConnection();
            return DBUtils.retreiveEleveDataFromLecteur(c, uid);


        } catch (SQLException | IOException e) {
            e.printStackTrace();

            return "{\n" +
                    "    \"stream\": false,\n" +
                    "    \"error\": \"message d'erruer\"\n" +
                    "}";

        }

    }
    ///pour pouvoir inserer un eleve il faut un deuxieme capteur(chez le cpe ) et pour manipuler ceux deuxieme capteur cree un programe qui va lire le programe sur l'ordinateur du cpe.


    //
}
