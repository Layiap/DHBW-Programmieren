package de.dhbwka.java.probeklausur;

public class Player {
    private String name;
    private int countDartsthrown;
    private int remainingPoints;

    private Visit[] visits;
    private int visit_index;

    public Player(String name) {
        this.name = name;
        this.remainingPoints = 501;
        this.visits = new Visit[10];
        this.countDartsthrown = 0;
        this.visit_index = 0;
    }

    public String getName() {
        return name;
    }

    public int getRemainingPoints() {
        for (Visit v : visits) {
            this.remainingPoints -= v.getValue();
        }
        return this.remainingPoints;
    }

    public boolean addVisit (Visit visit) {

        // Überworfen
        if (this.getRemainingPoints() - visit.getValue() < 0) {
            return false;
        }

        //Wurf hinzufügen
        this.visits[this.visit_index] = visit;
        this.visit_index++;
        this.countDartsthrown += visit.getFields().length;

        return true;
    }
}
