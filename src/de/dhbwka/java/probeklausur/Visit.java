package de.dhbwka.java.probeklausur;

public class Visit {
    private Field[] fields;

    public Visit(Field[] fields) throws IllegalArgumentException {

        // Exception Werfen
        if (fields.length > 3) {
            throw new IllegalArgumentException("Die Anzahl der Würfe wurde überschritten");
        } else {
            this.fields = fields;
        }
    }

    public Field[] getFields() {
        return this.fields;
    }

    public int getValue() {
        int summe = 0;

        for (Field f : this.fields) {
            // Bei Doppelten Werten
            if (f.getLabel().toCharArray()[0] == 'D') {
                summe += f.getValue() * 2;

            } else // Bei dreifach Werten
                if (f.getLabel().toCharArray()[0] == 'T') {
                summe += f.getValue() * 3;
            } else {
                    summe += f.getValue();
                }
        }

        return summe;
    }

    public Field getLastField() {
        return this.fields[this.fields.length-1];
    }
}
