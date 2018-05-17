package de.dhbwka.java.exercise.arrays;

/*
Matthias Häfele
TINF17B5
08.02.2018

Info: Ausgabe wird krumm wenn die Zahlen in den Zweistelligen Bereich kommen
    aber das war ja nicht teil der Aufgabe das so zu formatieren
*/

public class Pascal {
    public static void main(String[] args) {

        // Grenze wie viele Ebenen die Pyramide haben soll
        int grenze = 20;
        int leerzeichencounter = grenze;

        int[][] arr = new int[grenze][];

        for (int i = 0; i < grenze; i++) {
            arr[i] = new int[i+1];

            // Spitze der Pyramide deklarieren
            arr[0][0] = 1;

            // Schleife die Leereichen ausdruckt (Für die Konsolen ausgabe)
            for (int l = 0; l < leerzeichencounter; l++) {
                System.out.print(" ");
            }
            leerzeichencounter--;

            // Durchläuft gleich das neu generierte Sub-Array
            for (int j = 0; j < arr[i].length; j++) {

                // Überprüft ob Zeilenanfang oder Zeilenende
                if (j == 0 || arr[i].length == (j+1)) {
                    // Initialisiert den Zeilenanfang und das Zeilenende mit 1
                    arr[i][j] = 1;
                } else {
                    // Addiert die zwei Zahlen zusammen die ein Index früher stehem
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
