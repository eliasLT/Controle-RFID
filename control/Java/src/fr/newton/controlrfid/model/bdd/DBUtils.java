package fr.newton.controlrfid.model.bdd;

import fr.newton.controlrfid.model.structures.Eleve;
import fr.newton.controlrfid.model.structures.HoraireCours;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBUtils {


    //==========================================================================================
    //                                       DELETE
    //==========================================================================================

    //==========================================================================================
    //                                       UPDATE
    //==========================================================================================
    public static boolean  renvoieeleve(Connection c ) throws SQLException {

           PreparedStatement preparedStatement = c.prepareStatement(DBRequests.UPDATE_STATUS_ELEVE_SQL);
           ResultSet setID = preparedStatement.executeQuery();
            int id = setID.getInt("id");
                PreparedStatement preparedStatementE = c.prepareStatement(DBRequests.GET_ELEVE_BY_ID);
                preparedStatementE.setInt(1, id);
                ResultSet setE = preparedStatementE.executeQuery();
                setE.next();
                String nom = setE.getString("e.nom");
                String prenom = setE.getString("prenom");
                String classe = setE.getString("c.nom");
                String photo = setE.getString("photo");
                Eleve e = new Eleve(id, nom, prenom, classe, photo);
                return true;
    }

    //==========================================================================================
    //                                       INSERT
    //==========================================================================================

    public static boolean InsertHoraire(Connection c, String jour,String Hdebut,String hFin, String classe, String prof) throws SQLException {
        PreparedStatement preparedStatement = c.prepareStatement(DBRequests.INSERT_HORAIRE_COURS_SQL);
        preparedStatement.setString(1, jour);
        preparedStatement.setString(2,Hdebut);
        preparedStatement.setString(3,hFin);
        preparedStatement.setString(4, classe);
        preparedStatement.setString(5, prof);
        int res = preparedStatement.executeUpdate();
        return res == 1;
    }

    public static boolean insertclasse(Connection c, String classe) throws SQLException {
        PreparedStatement preparedStatement = c.prepareStatement(DBRequests.INSERT_CLASSE_SQL);
        preparedStatement.setString(1, classe);
        int res = preparedStatement.executeUpdate();
        return res == 1;
    }

    public static boolean insertEleve(Connection c, String nom, String prenom, String photo, String classe) throws SQLException {
        PreparedStatement preparedStatement = c.prepareStatement(DBRequests.INSERT_ELEVE_SQL);
        preparedStatement.setString(1, nom);
        preparedStatement.setString(2, prenom);
        preparedStatement.setString(3, photo);
        preparedStatement.setString(4, classe);
        int res = preparedStatement.executeUpdate();
        return res == 1;
    }


    //==========================================================================================
    //                                       SELECT
    //==========================================================================================
    public static ArrayList<Eleve> getElevesLate(Connection c, String jour) {
        try {
            PreparedStatement preparedStatementID = c.prepareStatement(DBRequests.GET_ELEVE_LATE_SQL);
            preparedStatementID.setString(1, jour);
            ResultSet setID = preparedStatementID.executeQuery();
            ArrayList<Eleve> res = new ArrayList<>();
            while (setID.next()) {
                int id = setID.getInt("id");
                PreparedStatement preparedStatementE = c.prepareStatement(DBRequests.GET_ELEVE_BY_ID);
                preparedStatementE.setInt(1,id);
                ResultSet setE = preparedStatementE.executeQuery();
                setE.next();
                String nom = setE.getString("e.nom");
                String prenom = setE.getString("prenom");
                String classe = setE.getString("c.nom");
                String photo = setE.getString("photo");
                Eleve e = new Eleve(id, nom, prenom, classe, photo);
                res.add(e);
            }
            return res;
        } catch (SQLException e) {
            return new ArrayList<>();
        }
    }

    public static ArrayList<Eleve> getElevesABS(Connection c, String jour) {
        try {
            PreparedStatement preparedStatementID = c.prepareStatement(DBRequests.GET_ELEVE_ABS_SQL);
            preparedStatementID.setString(1, jour);
            ResultSet setID = preparedStatementID.executeQuery();
            ArrayList<Eleve> res = new ArrayList<>();
            while (setID.next()) {
                int id = setID.getInt("id");
                PreparedStatement preparedStatementE = c.prepareStatement(DBRequests.GET_ELEVE_BY_ID);
                preparedStatementE.setInt(1,id);
                ResultSet setE = preparedStatementE.executeQuery();
                setE.next();
                String nom = setE.getString("e.nom");
                String prenom = setE.getString("prenom");
                String classe = setE.getString("c.nom");
                String photo = setE.getString("photo");
                Eleve e = new Eleve(id, nom, prenom, classe, photo);
                res.add(e);
            }
            return res;
        } catch (SQLException e) {
            return new ArrayList<>();
        }
    }

    public static ArrayList<Eleve> getEleveByName(Connection c , String nom , String prenom) {
        try {
            PreparedStatement preparedStatementID = c.prepareStatement(DBRequests.GET_ELEVE_BY_NAME);
            preparedStatementID.setString(1, nom);
            preparedStatementID.setString(2,prenom);
            ResultSet setID = preparedStatementID.executeQuery();
            ArrayList<Eleve> res = new ArrayList<>();
            while (setID.next()) {
                int id = setID.getInt("id");
                PreparedStatement preparedStatementE = c.prepareStatement(DBRequests.GET_ELEVE_BY_ID);
                preparedStatementE.setInt(1,id);
                ResultSet setE = preparedStatementE.executeQuery();
                setE.next();
                String classe = setE.getString("c.nom");
                String photo = setE.getString("photo");
                Eleve e = new Eleve(id, nom, prenom, classe, photo);
                res.add(e);
            }
            return res;
        } catch (SQLException e) {
            return new ArrayList<>();
        }

    }


    public static ArrayList<HoraireCours> getSchedule(Connection c , String nom, String prenom ) {
        try {
            Eleve eleve = getEleveByName(c, nom, prenom).get(0);
            PreparedStatement preparedStatementID = c.prepareStatement(DBRequests.GET_SCHEDULE_OF_ELEVE_SQL);
            preparedStatementID.setInt(1, eleve.getId());
            ResultSet setID = preparedStatementID.executeQuery();
            ArrayList<HoraireCours> res = new ArrayList<>();
            while (setID.next()) {
                String classe = setID.getString("c.nom");
                String jour = setID.getString("jour");
                String HD = setID.getString("h_debut");
                String HF = setID.getString("h_fin");
                String prof = setID.getString("nom_prof");
                HoraireCours h = new HoraireCours(classe, HD,HF,prof, jour);
                res.add(h);
            }
            return res;
        } catch (SQLException e) {
            return new ArrayList<>();
        }
    }


    public static void main(String[] args) throws SQLException {
//        insertEleve(DBConnexion.getMySQLConnection(), "SON", "GOHAN", "url/photo", "SAR" );
//        InsertHoraire(DBConnexion.getMySQLConnection(),"Lundi","08:00:00","09:00:00","SAR","naruto");
//        insertclasse(DBConnexion.getMySQLConnection(),"Maman");
        ArrayList<HoraireCours> horaire = getSchedule(DBConnexion.getMySQLConnection(), "lotfi", "elias");
        for (int i = 0; i < horaire.size(); i++) {
            HoraireCours h = horaire.get(i);
            System.out.print(h.getJour()+" - ");
            System.out.print(h.getHD() + " - ");
            System.out.println(h.getHF());

        }
//




        }
}

