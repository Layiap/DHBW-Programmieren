package de.dhbwka.java.exercise.control;

/*
Matthias Häfele
TINF17B5
02.03.2018
*/

import java.util.Scanner;

public class Babylon {

    public static void main(String[] args) {
        System.out.print("Bitte zahl zum teilen eingeben: ");
        int nextNum = new Scanner(System.in).nextInt();

        int i = 0;
        int begin = nextNum;

        float x = 1;
        while(true) {

            System.out.println(i + ": " + x);
            i++;

            float num = x;
            x = (x + begin / x) / 2f;

            if (Math.abs(num - x) < Math.pow(10f, -6f)) {
                break;
            }
        }

        System.out.println("done, result: " + Math.round(x * 100) / 100f);
    }
}
