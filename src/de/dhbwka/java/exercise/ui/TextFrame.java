package de.dhbwka.java.exercise.ui;

/*
 * Grafische Benutzeroberflächen (GUI/Swing) (1)
 *
 * #######################
 * #                     #
 * #    Matthias Häfele  #
 * #     2018.05.17      #
 * #                     #
 * #######################
 */

import javax.swing.*;
import java.io.*;

public class TextFrame extends JFrame {


    public TextFrame(String dateiname, int breite, int hoehe) {
        // Dateiname als Titel setzen
        super(dateiname);

        // Größe einstellen
        this.setSize(breite, hoehe);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        File file = new File(dateiname);
        StringBuffer fileInput = new StringBuffer();

        // Datei einlesen
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                fileInput.append(br.readLine() + System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Textbox
        JTextArea jTextArea = new JTextArea();
        jTextArea.setText(fileInput.toString());
        this.add(jTextArea);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        TextFrame t = new TextFrame("loremipsum.txt", 300, 300);


    }
}
