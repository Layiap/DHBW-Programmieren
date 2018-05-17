package de.dhbwka.java.exercise.io;

/*
Matthias Häfele
TINF17B5
08.03.2018
*/

import java.io.*;

public class Files {

    public static void main(String[] args) {

        // Ordner anlegen
        File dir = new File(".\\myDir");
        dir.mkdir();
        System.out.println(dir.getAbsolutePath());

        File newFile1 = new File(".\\myDir\\foo1");
        File newFile2 = new File(".\\myDir\\foo2");
        File newFile3 = new File(".\\myDir\\foo3");

        try {
            newFile1.createNewFile();
            System.out.println(newFile1.getAbsolutePath());

            newFile2.createNewFile();
            System.out.println(newFile2.getAbsolutePath());

            newFile3.createNewFile();
            System.out.println(newFile3.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Dateien löschen
        newFile1.delete();
        newFile2.delete();
        newFile3.delete();
        dir.delete();
    }
}