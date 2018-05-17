package de.dhbwka.java.exercise.classes;

/*
Matthias Häfele
TINF17B5
15.02.2018
*/

public class Radio {

    private boolean on;
    private int volume;
    private double frequency;

    public static void main(String[] args) {

        // Test Radios
        Radio r1 = new Radio();
        Radio r2 = new Radio(true, 4, 103.0);
        Radio r3 = new Radio(true, 1, 88.0);

        r3.decVolume();
        r3.decVolume();

        r1.turnOff();

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
    }


    public Radio() {

        // sinnvolle Startwerte
        this.on = true;
        this.volume = 5;
        this.frequency = 107.2;
    }

    public Radio(boolean on, int volume, double frequency) {
        this.on = on;

        // Checken ob die Lautstärke auch zwischen 0 und 10 liegt, ansonsten Grenzwerte benutzen
        if (volume > 10) {
            this.volume = 10;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }

        this.setFrequency(frequency);
    }

    // Diese Methoden sollen die Lautstärke um 1 Einheit ändern (nur möglich im Zustand an).
    public void incVolume() {

        if (on && this.volume <= 9) {
            this.volume++;
        }
    }

    // Diese Methoden sollen die Lautstärke um 1 Einheit ändern (nur möglich im Zustand an).
    public void decVolume() {

        if (on && this.volume >= 1) {
            this.volume--;
        }
    }

    //Diese Methoden sollen den Zustand des Attributs eingeschaltet ändern.
    public void turnOn() {
        this.on = true;
    }

    //Diese Methoden sollen den Zustand des Attributs eingeschaltet ändern.
    public void turnOff() {
        this.on = false;
    }

    // Diese Methode soll eine Frequenz speichern.
    // Ist die gewählte Frequenz außerhalb des erlaubten Frequenzbereichs, so soll die Frequenz 99.9 gewählt werden.
    public void setFrequency(double frequency) {

        // Checken ob die Frequenz auch zwischen 85.0 und 110.0 liegt, ansonsten Grenzwerte benutzen
        if (frequency > 110.0 || frequency < 85.0) {
            this.frequency = 99.9;
        } else {
            this.frequency = frequency;
        }
    }

    //Diese Methode soll Informationen über den internen Zustand als String zurückgeben.
    // Sie soll eine Zeichenkette der Form "Radio an: Freq=98.4, Laut=2" zurückgeben.
    @Override
    public String toString() {

        if (this.on) {
            return "Radio an: Frequenz: " + this.frequency + " Lautstärke: " + this.volume;
        } else {
            return "Radio aus: Frequenz: " + this.frequency + " Lautstärke: " + this.volume;
        }
    }
}
