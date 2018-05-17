package de.dhbwka.java.exercise.control;

/*
Matthias Häfele
TINF17B5
02.03.2018
*/

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        // Jahreszahl einlesen
        Scanner s = new Scanner(System.in);
        System.out.print("Bitte Jahr angeben: ");
        String eingabe = s.next();

        // Eingelesener Wert in INT konvertieren
        int jahr = Integer.parseInt(eingabe);

        if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
            System.out.println(jahr + " ist ein Schaltjahr");
        } else {
            System.out.println(jahr + " ist kein Schaltjahr");
        }
    }
}
