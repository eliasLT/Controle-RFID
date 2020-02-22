package fr.newton.controlrfid.model.structures;

import java.util.ArrayList;
import java.util.Comparator;

public class HoraireCours {
    private String classe;
    private String HD;
    private String HF;
    private String prof;
    private String jour;

    public HoraireCours (String classe, String HD, String HF, String prof, String jour) {
        this.classe = classe;
        this.HD = HD;
        this.HF = HF;
        this.prof = prof;
        this.jour = jour;
    }


    public String getClasse() {
        return classe;
    }

    public String getHD() {
        return HD;
    }

    public String getHF() {
        return HF;
    }

    public String getProf() {
        return prof;
    }


    public String getJour() {
        return jour;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public void setHF(String HF) {
        this.HF = HF;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }


    public void setJour(String jour) {
        this.jour = jour;
    }


}


