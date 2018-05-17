package de.dhbwka.java.exercise.io;

/*
Matthias Häfele
TINF17B5
08.03.2018
*/

import java.io.*;

    public class TextfileLines {

        public static void main(String[] args) {
            File example = new File("beispiel.txt");

            // Geht wohl auch mit Scanner
            try(BufferedReader br = new BufferedReader(new FileReader(example))) {
                br.readLine();

                StringBuffer sb = new StringBuffer();

                for (int i = 2; i <= 5; i++) {
                    String line = br.readLine();
                    System.out.println(line);
                    sb.append(line);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}