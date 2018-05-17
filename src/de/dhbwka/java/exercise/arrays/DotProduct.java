package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

/*
Matthias Häfele
TINF17B5
01.02.2018
*/

public class DotProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Anzahl der Elemente einlesen
        System.out.print("Bitte Anzahl der Elemente n eingeben: ");
        int n = s.nextInt();

        // Koordinaten des X Vektors einlesen
        int[] koordinaten_x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Bitt x_" + i + " eingeben: ");
            koordinaten_x[i] = s.nextInt();
        }
        // Koordinaten des Y Vektors einlesen
        int[] koordinaten_y = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Bitt y_" + i + " eingeben: ");
            koordinaten_y[i] = s.nextInt();
        }
        s.close();

        // Formel ausrechnen
        int ergebnis = 0;
        for (int i = 0; i < n; i++) {
            ergebnis += koordinaten_x[i] * koordinaten_y[i];
        }

        System.out.println("Das Skalarprodukt von x und y ist: " + ergebnis);

    }
}
