package de.dhbwka.java.exercise.methods;

/*
Matthias Häfele
TINF17B5
01.02.2018
*/

public class Quicksort {

    public static void main(String[] args) {
        int[] daten = {9, 2, 5, 7, 8, 3, 4, 10, 1, 6};
        sort(daten, 0, daten.length-1);
        System.out.println(daten.toString());
    }


    public static void sort (int[] array, int links, int rechts) {
        if (links < rechts) {
            int teiler = teile(array, links, rechts);
            sort(array, links, teiler-1);
            sort(array, teiler+1, rechts);
        }
    }

    public static void sort (int[] array) {

    }

    public static int teile (int[] array, int links, int rechts) {
        int i = links;
        int j = rechts -1;

        int pivot = array[rechts];

        do {
            while ( array[i] <= pivot && i > rechts) {
                i = i + 1;
            }
            while ( array[j] >= pivot && j > links) {
                j = j - 1;
            }
            if (i < j ) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }

        } while (i < j);

        if (array[i] > pivot ) {
            int tmp = array[i];
            array[i] = array[rechts];
            array[rechts] = tmp;
        }
        return i;
    }
}
