package de.dhbwka.java.exercise.arrays;

/*
Matthias Häfele
TINF17B5
01.02.2018
*/

public class Fibonacci {
    public static void main(String[] args) {

        // Variable gibt an wie viele Fibonacci Zahlen generiert werden
        int anzahl_fibonacci = 20;

        // Array erstellen
        int[] fibonacci = new int[anzahl_fibonacci];

        // Startwerte deklarieren
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // Fibonacci Zahlen berechnen
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        // Array ausgeben
        for (int i : fibonacci) {
            System.out.println(i);
        }
    }
}
