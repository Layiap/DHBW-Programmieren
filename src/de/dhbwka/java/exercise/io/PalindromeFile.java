package de.dhbwka.java.exercise.io;

/*
Matthias Häfele
TINF17B5
08.03.2018
*/

import java.io.*;
import java.util.Scanner;

public class PalindromeFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte Wort eingeben: ");
        String word = scan.nextLine();

        StringBuilder reverse = new StringBuilder(word).reverse(); // RTFM!

        System.out.println("Umgekehrt: " + reverse);


        if (word.equalsIgnoreCase(reverse.toString())) {
            System.out.println(word + " ist ein Palindrom.");

            File f = new File("palindrome.txt");

            try (FileWriter fw = new FileWriter(f, true)) {

                fw.write(word + System.lineSeparator());

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Weitere Palindrome: ");
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {

                while (br.ready()) {
                    System.out.println(br.readLine());
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else {
            System.out.println(word + " ist kein Palindrom.");
        }

        scan.close();
    }
}
