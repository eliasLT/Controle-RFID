package fr.newton.controlrfid.model.structures;

import java.util.ArrayList;
import java.util.Comparator;

public class Eleve {
    private int id;
    private String nom;
    private String prenom;
    private String classe;
    private String photo;
    private String heureArrive;


    public Eleve(int id, String nom, String prenom, String classe, String photo, String heureArrive) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.photo = photo;
        this.heureArrive = heureArrive;
    }

    public Eleve(int id, String nom, String prenom, String classe, String photo) {
        this(id, nom, prenom, classe, photo, "24:59");
    }

    // Ce constructeur par defaut est requis par Gson
    public Eleve(){

    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getClasse() {
        return classe;
    }

    public String getPhoto() {
        return photo;
    }

    public String getHeureArrive() {
        return heureArrive;
    }


    /**
     * retourne si l'eleve et en retard
     * @param horaires correpond a tous les emplois du temps filtre les emplois du temps recuperer les horaires de leleve et du jour
     * @param jour
     * @return filtre les emplois du temps recuperer les horaires de leleve et du jour
     */
//    public boolean isLate(HoraireCours[] horaires, String jour){
//        ArrayList<HoraireCours> temp = new ArrayList<>();
//        for (int i = 0; i < horaires.length ; i++){
//            if(horaires[i].getJour() == jour &&
//                    horaires[i].getClasse() == this.getClasse()){
//                temp.add(horaires[i]);
//            }
//        }
//        //Class anonyme
//        //verifie le quels et le plus grand ensuite le compare automatiquement
//        temp.sort(new Comparator<HoraireCours>() {//trie les horaire par rapport a l'heure de debut
//            @Override
//            public int compare(HoraireCours o1, HoraireCours o2) {
//                if(o1.getHD() < o2.getHD()){
//                    return -1;
//                }else if(o1.getHD() > o2.getHD()){
//                    return 1;
//                }
//                return 0;
//            }
//        });
//
//        String[] hm = this.getHeureArrive().split(":");
//        int add = 0;
//        if(!hm[1].equals("00")){
//            add = 1;
//        }
//        int HA = Integer.parseInt(hm[0]) + add;
//        if(temp.get(0).getHD() >= HA ){
//            return false;
//        }
//        else {
//            return true;
//        }
//    }
}
