package fr.newton.controlrfid.model.bdd;

public class DBRequests {


    //==========================================================================================
    //                                      INSERT
    //==========================================================================================

    public static final String INSERT_CARTE_SQL =
            "INSERT INTO cartes(id, idE) VALUES (?,?);";

    public static final String INSERT_HORAIRE_COURS_SQL =
            "INSERT INTO horaire_cours" +
                    "(`jour`, `h_debut`, `h_fin`, `id_classe`, `nom_prof`) VALUES " +
                    "(?, CAST(? AS TIME), CAST(? AS TIME), (SELECT id FROM classe WHERE nom =?), ?)";

    public static final String INSERT_ELEVE_SQL             =
            "INSERT INTO eleves (`nom`, `prenom`, `photo`, `id_classe`)" +
                    "VALUES (?, ?, ?, (SELECT id FROM classe WHERE nom =?) )";


    public static final String INSERT_CLASSE_SQL =
            "INSERT INTO classe(nom) VALUES (?)";


    //==========================================================================================
    //                                      UPDATE
    //==========================================================================================


    public static final String UPDATE_STATUS_ELEVE_SQL =
            "UPDATE eleves SET renvoyer = ? WHERE id = ?";


    //==========================================================================================
    //                                      SELECT
    //==========================================================================================

    public static final String GET_ELEVE_BY_ID =
            "SELECT e.nom, e.prenom, e.photo, c.nom " +
                    "FROM eleves AS e, classe AS c " +
                    "WHERE e.id = ? " +
                    "AND e.id_classe = c.id";

    public static final String GET_ELEVE_BY_NAME =
            "SELECT e.id " +
                    "FROM eleves AS e, classe AS c " +
                    "WHERE e.nom = ? " +
                    "AND e.prenom = ? " +
                    "AND e.id_classe = c.id";


    public static final String GET_SCHEDULE_OF_ELEVE_SQL =
            "SELECT jour, h_debut, h_fin, nom_prof, c.nom " +
            "FROM horaire_cours as h , classe as c , eleves as e " +
            "WHERE e.id = ? " +
            "AND e.id_classe = c.id " +
            "AND h.id_classe = c.id";



    public static final String GET_ELEVE_LATE_SQL           =
            "SELECT DISTINCT e.id " +
            "FROM eleves AS e, horaire_cours AS hc, classe AS c, entree_eleve AS ee " +
            "WHERE hc.jour = ? " +
            "AND ee.h_entree > hc.h_debut " +
            "AND e.id_classe = hc.id_classe " +
            "AND e.id = ee.idE " +
            "ORDER BY e.id";

    public static  final String GET_ELEVE_ABS_SQL                =
            "SELECT DISTINCT e.id " +
            "FROM eleves as e, horaire_cours as hc " +
            "WHERE  hc.jour = ? " +
            "AND hc.id_classe = e.id_classe " +
            "AND e.id NOT IN ( " +
            "    SELECT idE " +
            "    FROM entree_eleve " +
            ")";


    //==========================================================================================
    //                                       DELETE
    //==========================================================================================

}

