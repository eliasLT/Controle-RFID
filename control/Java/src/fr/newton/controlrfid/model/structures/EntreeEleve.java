package fr.newton.controlrfid.model.structures;

public class EntreeEleve {
    private String uid;
    private String heure;

    public EntreeEleve(String uid, String heure) {
        this.uid = uid;
        this.heure = heure;
    }

    public String getIdEleve() {
        return uid;
    }

    public void setIdEleve(String uid) {
        this.uid = uid;
    }

    public String getHeureArrive() {
        return heure;
    }

    public void setHeureArrive(String heure) {
        this.heure = heure;
    }
}
