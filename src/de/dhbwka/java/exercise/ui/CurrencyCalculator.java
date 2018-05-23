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

public class CurrencyCalculator {

    public static void main(String[] args) {

        JFrame jf = new JFrame("Währungsrechner");

        JPanel jp = new JPanel();
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));

        // Textfeld dem Box layout hinzufügen
        jp.add(new JTextField("Bitte Wert zum umrechnen eingeben"));

        // Neues Panel erstellen (Flow layout)
        JPanel buttons = new JPanel();

        // Buttons erstellen und dem Panel mit dem Flow layout hinzufügen
        JButton btn_eurusd = new JButton("EUR -> USD");
        JButton btn_usdeur = new JButton("USD -> EUR");
        JButton btn_cancel = new JButton("Cancel");

        buttons.add(btn_eurusd);
        buttons.add(btn_usdeur);
        buttons.add(btn_cancel);

        // Flow layout zum Panel mit dem Box Layout hinzufügen
        jp.add(buttons);

        jf.add(jp);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
