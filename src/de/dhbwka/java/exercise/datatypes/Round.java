package de.dhbwka.java.exercise.datatypes;

/*
Matthias Häfele
TINF17B5
18.01.2018
*/

public class Round {

	public static void main(String[] args) {
		
		double pi = 3.1415926; // Naeherung der Kreiszahl Pi
		double e = 2.7182818; // Naeherung der Eulerschen Zahl e
		
		int piInt = (int) pi;
		int eInt = (int) e;
		
		System.out.println("Pi ganzzahlig: " + piInt); // Ausgabe: 3
		System.out.println("e ganzzahlig: " + eInt); // Ausgabe: 2
		
		int piRoundInt = (pi >= 0) ? (int) (pi + 0.5) : (int) (pi - 0.5);
		int eRoundInt = (e >= 0) ? (int) (e + 0.5) : (int) (e - 0.5);
		
		System.out.println("Pi gerundet: " + piRoundInt);
		System.out.println("e gerundet: " + eRoundInt);

	}
}
