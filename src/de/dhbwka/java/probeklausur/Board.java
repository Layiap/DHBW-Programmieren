package de.dhbwka.java.probeklausur;

public class Board {
    private Field[] field;

    public Board() {

        // Feld mit 62 Feldern erstellen
        this.field = new Field[63];

        // Initialisierung der Felder mit einfacher Wertigkeit
        for (int i = 0; i <= 19; i++) {
            this.field[i] = new Field("" + (i+1), i+1, false);
        }

        // Initialisierung der Felder mit doppelter Wertigkeit
        for (int i = 20; i <= 39; i++) {
            this.field[i] = new Field("D" + (i-19), i+1, true);
        }

        // Initialisierung der Felder mit dreifacher Wertigkeit
        for (int i = 40; i <= 59; i++) {
            this.field[i] = new Field("T" + (i-39), i+1, false);
        }

        // Initialisierung des Single Bull Feldes
        this.field[60] = new Field("25", 25, false);

        // Initialisierung des Bullseye Feldes
        this.field[61] = new Field("BULL", 50, true);

        // Initialisierung der Niete
        this.field[62] = new Field("x", 0, false);
    }

    public Field parseField (String label) {

        int i = 0;
        int ii = 0;
        boolean uebereinstimmung = false;


        for (Field f : this.field) {
            if (label.equalsIgnoreCase(f.getLabel())) {
                uebereinstimmung = true;
                ii = i;
            }
            i++;
        }

        if (uebereinstimmung) {
            return this.field[ii];
        } else {
            return null;
        }
    }

    // Zu debugging Zwecken
    public static void main(String[] args) {
        Board f = new Board();
        Field f1 = f.parseField("D16");
        System.out.println(f1.toString());
    }
}
