package de.dhbwka.java.exercise.control;

/*
Matthias Häfele
TINF17B5
02.03.2018
*/

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {

        int toGuess = (int) (Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Namen eingeben: ");
        String name = scanner.nextLine();

        while (true) {

            System.out.print("Rate eine Zahl [1-100]: ");
            int tip = scanner.nextInt();

            if (tip > toGuess) {
                System.out.println("zu hoch");
            } else if (tip < toGuess) {
                System.out.println("zu tief");
            } else {
                System.out.println(name + " hat gewonnen");
                break;
            }
        }
    }
}
