package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

/*
Matthias Häfele
TINF17B5
08.02.2018
*/

public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Anzahl der Elemente n einlesen
        System.out.print("Bitte Anzahl der Zeilen n eingeben: ");
        int n = s.nextInt();

        // Anzahl der Elemente m einlesen
        System.out.print("Bitte Anzahl der Spalten m eingeben: ");
        int m = s.nextInt();

        s.close();

        // zweidimensionale Arrays mit gewünschter Größe erstellen
        int[][] matrix_x = new int[n][m];
        int[][] matrix_y = new int[n][m];
        int[][] matrix_z = new int[n][m]; // Matrix für das Erbenis

        // Arrays mit Zufallszahlen generieren
        for (int in = 0; in < n; in++) {
            for (int im = 0; im < m; im++) {
                matrix_x[in][im] = (int)(Math.random() * 100.0);
                matrix_y[in][im] = (int)(Math.random() * 100.0);

                // Werte Subtrahieren
                matrix_z[in][im] = matrix_x[in][im] - matrix_y[in][im];
            }
        }

        // Ausgabe des X Arrays
        System.out.print("X:");
        for (int in = 0; in < n; in++) {
            System.out.printf("\n"); //Zeilenumbruch

            for (int im = 0; im < m; im++) {
                System.out.printf("%4d", matrix_x[in][im]);
            }
        }

        // Ausgabe des Y Arrays
        System.out.print("\nY:");
        for (int in = 0; in < n; in++) {
            System.out.printf("\n"); //Zeilenumbruch

            for (int im = 0; im < m; im++) {
                System.out.printf("%4d", matrix_y[in][im]);
            }
        }

        // Ausgabe des Z Arrays
        System.out.print("\nX-Y:");
        for (int in = 0; in < n; in++) {
            System.out.printf("\n"); //Zeilenumbruch

            for (int im = 0; im < m; im++) {
                System.out.printf("%4d", matrix_z[in][im]);
            }
        }
    }
}
