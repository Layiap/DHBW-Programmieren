package de.dhbwka.java.exercise.control;

/*
Matthias Häfele
TINF17B5
02.03.2018
*/

import java.util.Scanner;

public class AddUp {

    public static void main(String[] args) {
        System.out.println("Zahlen eingeben, negative Zahl zum abbrechen");

        int num = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int input = scanner.nextInt();
            if (input >= 0) {
                num += input;
            } else {
                break;
            }
        }

        System.out.println("Summe " + num);
        System.out.println("Jetzt mit Do-While");

        num = 0;
        boolean done = false;

        do {
            int input = scanner.nextInt();
            if (input >= 0) {
                num += input;
            } else {
                done = true;
            }
        } while (!done);

        System.out.println("Summe " + num);
    }
}
