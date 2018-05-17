package de.dhbwka.java.exercise.strings;

/*
Matthias Häfele
TINF17B5
08.03.2018
*/

import java.util.Scanner;

public class CrossTotal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte Zahl für Quersumme eingeben: ");
        String number = scan.next();
        int total = 0;
        for (char c : number.toCharArray())
            total += (c-'0');
        System.out.println("Die Quersumme von " + number +
                " ist " + total);
        scan.close();
    }
}