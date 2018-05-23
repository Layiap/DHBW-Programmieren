package de.dhbwka.java.exercise.ui;

/*
 * Grafische Benutzeroberflächen (GUI/Swing) (2)
 *
 * #######################
 * #                     #
 * #    Matthias Häfele  #
 * #     2018.05.23      #
 * #                     #
 * #######################
 */

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class TextfileViewer {

    public TextfileViewer (String filepath) {
        File file = new File(filepath);
        StringBuffer fileInput = new StringBuffer();

        String[] fileInput10 = null;

        // Datei einlesen
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            // Counter für die ersten 10 Zeilen
            int c = 0;
            fileInput10 = new String[10];

            while (br.ready()) {

                String s = br.readLine() + System.lineSeparator();
                fileInput.append(s);

                // 10er Array befüllen
                if (c < 10) {
                    fileInput10[c] = s;
                    c++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JFrame jFrame_textArea = new JFrame(filepath);
        jFrame_textArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Textbox
        JTextArea jTextArea = new JTextArea();
        jTextArea.setText(fileInput.toString());

        // Scroll Pane mit der TextArea initialisieren
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        //jFrame.add(jTextArea);
        // (!) Nicht die TextArea sondern die ScrollPane hinzufügen
        jFrame_textArea.add(jScrollPane);

        //jFrame.pack();
        jFrame_textArea.setSize(300, 300);
        jFrame_textArea.setVisible(true);


        JFrame jFrame_labels = new JFrame(filepath);
        jFrame_labels.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Jpanel mit Box Layout
        JPanel jp = new JPanel();
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));

        // Jpanel betanken
        for (String s : fileInput10) {
            jp.add(new JLabel(s));
        }

        jFrame_labels.add(jp);

        jFrame_labels.setSize(300, 300);
        jFrame_labels.setVisible(true);
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
