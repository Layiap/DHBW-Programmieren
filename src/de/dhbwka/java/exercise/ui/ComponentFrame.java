package de.dhbwka.java.exercise.ui;

import javax.swing.*;
import java.awt.*;

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

public class ComponentFrame {

    JFrame frame;

    public ComponentFrame() {

        // Fenstertitel kann mitgegeben werden
        frame = new JFrame("Serveral basic Swing components");

        // Programm beenden wenn das Fenster geschlossen wird
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Neues Panel (Standardmäßig mit FlowLayout)
        JPanel panel_oben = new JPanel();

        // Elemente zum Panel hinzufügen
        panel_oben.add(new JLabel("JLabel"));
        panel_oben.add(new JTextField("JTextField"));
        panel_oben.add(new JButton("JButton"));
        panel_oben.add(new JToggleButton("JToggleButton"));
        panel_oben.add(new JCheckBox("JCheckBox"));

        // Droptown Liste betanken
        JComboBox JComboBox = new JComboBox();
        JComboBox.addItem("Servus");
        JComboBox.addItem("BlaBla");
        panel_oben.add(JComboBox);


        JPanel panel_unten = new JPanel();

        // Radio Buttons erstellen
        JRadioButton r1 = new JRadioButton("Hallo1");
        JRadioButton r2 = new JRadioButton("Hallo2");
        JRadioButton r3 = new JRadioButton("Hallo3");

        // Buttons zum Panel hinzufügen
        panel_unten.add(r1);
        panel_unten.add(r2);
        panel_unten.add(r3);

        // radio Buttons gruppieren
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        // Beide Layouts hinzufügen
        frame.add(panel_oben, BorderLayout.NORTH);
        frame.add(panel_unten, BorderLayout.SOUTH);

        frame.pack(); // Automatische Größe des Fensters
        frame.setVisible(true); // Fenster anzeigen
    }

    public static void main(String[] args) {
        new ComponentFrame();
    }

}
