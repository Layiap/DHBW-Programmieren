package de.dhbwka.java.exercise.arrays;

/*
Matthias Häfele
TINF17B5
01.02.2018
*/

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Anzahl der Elemente einlesen
        System.out.print("Bitte Anzahl der Elemente n eingeben: ");
        int n = s.nextInt();


        // Zahlen einlesen
        int[] zahlen = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Zahl " + i + " eingeben: ");
            zahlen[i] = s.nextInt();
        }

        // Boolean fals keine Zahl mehr verschoben wurde
        boolean sortier_flag = true;


        while (sortier_flag == true) {
            sortier_flag = false;

            // Array einmal durchsortieren
            for (int i = 1; i < n; i++) {

                // Wenn Zahl zuvor größer ist als aktuelle Zahl, vertauschen
                if (zahlen[i] < zahlen[i - 1]) {

                    int tmp = zahlen[i];
                    zahlen[i] = zahlen[i - 1];
                    zahlen[i - 1] = tmp;

                    // Sortier Flag hissen
                    sortier_flag = true;
                }
            }
        }

        // Ausgeben
        System.out.println("Zahlen sortiert: ");
        for (int i : zahlen) {
            System.out.print(i + " ");
        }
    }
}