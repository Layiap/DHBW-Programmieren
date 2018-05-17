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

    JFrame j;

    public ComponentFrame() {
        
        j = new JFrame("Serveral basic Swing components");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();

        jp.add(new JLabel("JLabel"));
        jp.add(new JTextField("JTextField"));
        jp.add(new JButton("JButton"));
        jp.add(new JToggleButton("JToggleButton"));
        jp.add(new JCheckBox("JCheckBox"));

        JComboBox JComboBox = new JComboBox();
        JComboBox.addItem("Servus");
        JComboBox.addItem("12345");

        jp.add(JComboBox);

        JPanel jp2 = new JPanel();

        JRadioButton r1 = new JRadioButton("Hallo1");
        JRadioButton r2 = new JRadioButton("Hallo2");
        JRadioButton r3 = new JRadioButton("Hallo3");

        // Buttons zum Panel hinzufügen
        jp2.add(r1);
        jp2.add(r2);
        jp2.add(r3);

        // radio Buttons gruppieren
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        // Beide Layouts hinzufügen
        j.add(jp, BorderLayout.NORTH);
        j.add(jp2, BorderLayout.SOUTH);

        j.pack(); // Automatische Größe des Fensters
        j.setVisible(true);
    }

    public static void main(String[] args) {
        new ComponentFrame();
    }
}
