package de.dhbwka.java.exercise.operators;

import java.util.Scanner;

/*
Matthias Häfele
TINF17B5
18.01.2018
*/

public class Easter {

	public static void main(String[] args) {

	    // Osterzahl einlesen
		Scanner s = new Scanner(System.in);
        System.out.print("Bitte Jahr angeben: ");
		String eingabe = s.next();

		// Eingelesener Wert in INT konvertieren
		int jahr = Integer.parseInt(eingabe);

		// Formel nach Gauß
		int a = jahr % 19;
		int b = jahr % 4;
		int c = jahr % 7;
		int k = jahr / 100;
		int p = (8 * k + 13) / 25;
		int q = k / 4;
		int m = (15 + k - p - q) % 30;
		int n = (4 + k - q) % 7;
		int d = (19 * a + m) % 30;
		int e = ((2 * b) + (4 * c) + (6 * d) + n) % 7;
		int ostern = (22 + d + e);

		// Ausgabe
        System.out.println("Im Jahr " + jahr + " ist der Ostersonntag am " + (ostern < 32 ? ostern : ostern - 31 ) + ". " + (ostern < 32 ? "März" : "April"));
	}

}
