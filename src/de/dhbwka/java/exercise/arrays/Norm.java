package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;


/*
Matthias Häfele
TINF17B5
01.02.2018
*/

public class Norm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Anzahl der Elemente einlesen
        System.out.print("Bitte Anzahl der Elemente n eingeben: ");
        int n = s.nextInt();

        // Koordinaten des Vektors einlesen
        int[] koordinaten = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Bitt x_" + i + " eingeben: ");
            koordinaten[i] = s.nextInt();
        }
        s.close();

        // Formel ausrechnen
        double ergebnis = 0.0;
        for (int i : koordinaten) {
            ergebnis += Math.pow((double)i,2.0);
        }
        ergebnis = Math.sqrt(ergebnis);


        System.out.println("Der Betrag von x ist: " + ergebnis);

    }
}
