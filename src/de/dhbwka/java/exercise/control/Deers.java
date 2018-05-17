package de.dhbwka.java.exercise.control;

/*
Matthias Häfele
TINF17B5
02.03.2018
*/

public class Deers {
    public static void main(String[] args) {
        System.out.println("Rehbestand:");
        int hirsche = 200;
        int jahr = 1;

        while (hirsche <= 300) {
            hirsche *= 1.1f;
            hirsche = (int) hirsche;
            hirsche -=15;

            System.out.printf("%2d. hirsche: %3d\n", jahr, hirsche);

            jahr++;
        }
    }
}
