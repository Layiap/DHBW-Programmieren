package de.dhbwka.java.exercise.strings;

/*
Matthias Häfele
TINF17B5
08.03.2018
*/

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte Wort eingeben: ");
        String word = scan.nextLine();

        StringBuilder reverse = new StringBuilder(word).reverse(); // RTFM!

        System.out.println("Umgekehrt: " + reverse);

        System.out.println(word + " ist "
                + (word.equalsIgnoreCase(reverse.toString()) ? "" : "k")
                + "ein Palindrom.");

        scan.close();
    }
}
