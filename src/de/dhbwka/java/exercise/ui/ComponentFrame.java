package de.dhbwka.java.exercise.ui;

import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;

public class ComponentFrame {

    JFrame j;

    public ComponentFrame() {

        j = new JFrame("Serveral basic Swing components");
        //j.setSize(300, 300);
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

        jp2.add(r1);
        jp2.add(r2);
        jp2.add(r3);

        j.add(jp, BorderLayout.NORTH);
        j.add(jp2, BorderLayout.SOUTH);

        j.pack();
        j.setVisible(true);


    }

    public static void main(String[] args) {
        new ComponentFrame();
    }
}
