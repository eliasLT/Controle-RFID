package fr.newton.controlrfid.model.structures;




public class EntreeEleve {
    private String idEleve;
    private String heureArrive;

    public EntreeEleve(String idEleve, String heureArrive) {
        this.idEleve = idEleve;
        this.heureArrive = heureArrive;
    }

    public String getIdEleve() {
        return idEleve;
    }

    public void setIdEleve(String idEleve) {
        this.idEleve = idEleve;
    }

    public String getHeureArrive() {
        return heureArrive;
    }

    public void setHeureArrive(String heureArrive) {
        this.heureArrive = heureArrive;
    }
}
