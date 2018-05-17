package de.dhbwka.java.exercise.arrays;

/*
Matthias Häfele
TINF17B5
01.02.2018
*/

public class Eratostenes {
    public static void main(String[] args) {

        // Grenzwert
        int n = 160;

        int[] sieve = new int[n];
        int[] primes = new int[n];
        int primes_index_counter = 0;
        int next_sieve_index = 0;

        // sieve und primes füllen
        for (int i = 0; i < n; i++) {
            sieve[i] = i + 2;
            //primes[i] = 0;
        }

        // While schleife durchläuft alle sieve Felder
        while (next_sieve_index < n) {

            // If verzweigung filtert sieve Felder mit 0 heraus
            if (sieve[next_sieve_index] != 0) {

                // kleinste Zahl in sieve bestimmen (Die 0 wird ausgeschlossen)
                int min = n + 2;
                for (int i = 0; i < n; i++) {
                    if (sieve[i] < min && sieve[i] != 0) {
                        min = sieve[i];
                    }
                }

                // Min zu primes hinzufügen
                primes[primes_index_counter] = min;
                primes_index_counter++;

                // Min und ganzzahlige vielfache aus sieve entfernen
                for (int i = 0; i < n; i++) {
                    if (sieve[i] % min == 0) {
                        sieve[i] = 0;
                    }
                }
            }
            next_sieve_index++;
        }

        // Ausgabe der Primzahlen
        for (int i : primes) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
