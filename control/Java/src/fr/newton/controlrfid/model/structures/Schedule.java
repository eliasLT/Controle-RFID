package fr.newton.controlrfid.model.structures;

import java.util.ArrayList;
import java.util.Map;

public class Schedule  {
    private Map<String, ArrayList<HoraireCours>> emploidutemps;

    public Schedule(Map<String, ArrayList<HoraireCours>> emploidutemps) {
        this.emploidutemps = emploidutemps;
    }
}
