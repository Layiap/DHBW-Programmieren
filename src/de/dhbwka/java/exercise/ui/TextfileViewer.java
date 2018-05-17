package de.dhbwka.java.exercise.ui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class TextfileViewer {

    public TextfileViewer (String filepath) {
        File file = new File(filepath);
        StringBuffer fileInput = new StringBuffer();

        // Datei einlesen
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            // Counter für die ersten 10 Zeilen
            int c = 0;
            String[] fileInput10 = new String[10];

            while (br.ready()) {

                String s = br.readLine() + System.lineSeparator();
                fileInput.append(s);

                // 10er Array befüllen
                if (c < 10) {
                    fileInput10[c] = s;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JFrame jFrametextBox = new JFrame(filepath);
        jFrametextBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Textbox
        JTextArea jTextArea = new JTextArea();
        jTextArea.setText(fileInput.toString());

        JScrollBar scroll = new JScrollBar(jTextArea);
        jFrametextBox.add(scroll);

        // TODO

        jFrametextBox.add(jTextArea);
        jFrametextBox.pack();
        jFrametextBox.setSize(300, 300);
        jFrametextBox.setVisible(true);

    }

    public static void main(String[] args) {

        // JFileChooser-Objekt erstellen
        JFileChooser chooser = new JFileChooser();

        // Filter erstellen
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Dateien", "txt", "text", "ascii", "json");
        chooser.setFileFilter(filter);

        // Dialog zum Öffnen von Dateien anzeigen
        int rueckgabeWert = chooser.showOpenDialog(null);

        // Abfragen ob der Dialog nicht abgebrochen wurde
        if(rueckgabeWert == JFileChooser.APPROVE_OPTION)
        {
            // Übergibt den Dateinamen an den Konstruktor
            TextfileViewer tfv = new TextfileViewer(chooser.getSelectedFile().getAbsolutePath());
        }
    }

}
