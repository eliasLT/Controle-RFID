package fr.newton.controlrfid.beans;
import fr.newton.controlrfid.model.structures.EntreeEleve;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class EntreeParser {


    public static ArrayList<EntreeEleve> parseEntreeEleveFile(String filename) {
        BufferedReader in = null;
        ArrayList<EntreeEleve> res = new ArrayList<>();
        try {
            in = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = in.readLine()) != null) {
                String[] elias = line.split("#");
                EntreeEleve ee = new EntreeEleve(elias[0], elias[1]);
                res.add(ee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return res;
    }

}




