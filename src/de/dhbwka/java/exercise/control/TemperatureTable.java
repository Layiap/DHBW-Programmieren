package de.dhbwka.java.exercise.control;

/*
Matthias Häfele
TINF17B5
02.03.2018
*/

public class TemperatureTable {

    public static void main(String[] args) {

        System.out.println("Fahrenheit | Celsius");
        System.out.println("----------------------");

        // Ausgabe bis 300 Fahrenheit
        for(int i=0; i <= 300; i += 20) {
            float celsius = Math.round(((5f / 9f) * (i - 32)) * 10) / 10f;
            System.out.printf("%3d        | %.1f\n", i, celsius);
        }

    }
}