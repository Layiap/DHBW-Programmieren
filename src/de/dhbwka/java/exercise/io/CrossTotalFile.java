package de.dhbwka.java.exercise.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrossTotalFile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte Zahl für Quersumme eingeben: ");

        String number = scan.next();
        int total = 0;

        for (char c : number.toCharArray())
            total += (c-'0');

        System.out.println("Die Quersumme von " + number + " ist " + total);

        File f = new File(".\\crosstotals.txt");
        try (FileWriter fw = new FileWriter(f, true)) {

            fw.write("Die Quersumme von " + number + " ist " + total + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        scan.close();
    }
}
