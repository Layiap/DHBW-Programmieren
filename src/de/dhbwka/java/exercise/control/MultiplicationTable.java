package de.dhbwka.java.exercise.control;

/*
Matthias Häfele
TINF17B5
02.03.2018
*/

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i=1; i <= 10; i++) {
            for(int j=1; j <= 10; j++) {

                int curRes = j * i;
                System.out.printf("%4d", curRes);

            }

            System.out.println("");
        }

    }
}
