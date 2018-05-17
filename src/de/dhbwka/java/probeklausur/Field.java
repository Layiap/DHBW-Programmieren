package de.dhbwka.java.probeklausur;

public class Field {

    private String label;
    private int value;
    private boolean doubleField;

    public Field(String label, int value, boolean doubleField) {
        this.label = label;
        this.value = value;
        this.doubleField = doubleField;
    }

    public String getLabel() {
        return label;
    }

    public int getValue() {
        return value;
    }

    public boolean isDoubleField() {
        return doubleField;
    }

    // Zu debugging Zwecken
    @Override
    public String toString() {
        return "Field{" +
                "label='" + label + '\'' +
                ", value=" + value +
                ", doubleField=" + doubleField +
                '}';
    }
}
