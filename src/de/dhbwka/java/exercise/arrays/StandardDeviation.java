package de.dhbwka.java.exercise.arrays;

/*
Matthias Häfele
TINF17B5
01.02.2018
*/

public class StandardDeviation {
    public static void main(String[] args) {
        // Array mit 100 Feldern
        int[] arr = new int[100];

        // Array befüllen
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 11);
        }

        // Mittelwert berechnen
        int summe = 0;
        for (int i : arr) {
            summe += i;
        }
        double mittelwert = (double)summe / arr.length;

        System.out.println("Der Mittelwert ist: " + mittelwert);

        // Standardabweichung
        double[] arr_abweichung = new double[100];

        double summe_abweichung = 0;
        for (int i : arr) {
            summe_abweichung += Math.pow(((double)i - mittelwert), 2.0);
        }


        System.out.printf("Die Standardabweichung beträgt: " + (Math.sqrt(summe_abweichung / (double)arr.length)));

    }
}
