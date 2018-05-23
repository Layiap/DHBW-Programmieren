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

// TODO Senden an Menü erweitern
// TODO Trennlinien einfügen


import javax.swing.*;
import java.awt.*;

public class EditorSimple {

    JFrame frame;

    public EditorSimple() {

        frame = new JFrame("Editor");

        JMenuBar menubar = new JMenuBar();

        JMenu datei = new JMenu("Datei");

        JMenuItem jm_new = new JMenuItem("Neu");
        datei.add(jm_new);
        JMenuItem jm_oeffnen = new JMenuItem("Öffnen");
        datei.add(jm_oeffnen);
        JMenuItem jm_schliessen = new JMenuItem("Schließen");
        datei.add(jm_schliessen);
        JMenuItem jm_speichern = new JMenuItem("Speichern");
        datei.add(jm_speichern);
        JMenuItem jm_speichernunter = new JMenuItem("Speichern unter...");
        datei.add(jm_speichernunter);
        JMenuItem jm_webseite = new JMenuItem("Als Webseite speichern");
        datei.add(jm_webseite);
        JMenuItem jm_suchen = new JMenuItem("Suchen");
        datei.add(jm_suchen);
        JMenuItem jm_versionen = new JMenuItem("Versionen");
        datei.add(jm_versionen);
        JMenuItem jm_vorschau = new JMenuItem("Webseitenvorschau");
        datei.add(jm_vorschau);
        JMenuItem jm_einrichten = new JMenuItem("Seite einrichten...");
        datei.add(jm_einrichten);
        JMenuItem jm_drucken = new JMenuItem("Drucken");
        datei.add(jm_drucken);
        JMenuItem jm_sendenan = new JMenuItem("Senden an");
        datei.add(jm_sendenan);
        JMenuItem jm_eigenschaften = new JMenuItem("Eigenschaften");
        datei.add(jm_eigenschaften);
        JMenuItem jm_last1 = new JMenuItem("test1.doc");
        datei.add(jm_last1);
        JMenuItem jm_last2 = new JMenuItem("test2.doc");
        datei.add(jm_last2);
        JMenuItem jm_last3 = new JMenuItem("test3.doc");
        datei.add(jm_last3);
        JMenuItem jm_beenden = new JMenuItem("Beenden");
        datei.add(jm_beenden);

        menubar.add(datei);

        JMenu bearbeiten = new JMenu("Bearbeiten");

        JMenuItem jm_bearbeiten_rueckgaengig = new JMenuItem("Rückgängig");
        bearbeiten.add(jm_bearbeiten_rueckgaengig);
        JMenuItem jm_bearbeiten_wiederholen = new JMenuItem("Wiederholen");
        bearbeiten.add(jm_bearbeiten_wiederholen);
        JMenuItem jm_bearbeiten_ausschneiden = new JMenuItem("Ausschneiden");
        bearbeiten.add(jm_bearbeiten_ausschneiden);
        JMenuItem jm_bearbeiten_kopieren = new JMenuItem("Kopieren");
        bearbeiten.add(jm_bearbeiten_kopieren);
        JMenuItem jm_bearbeiten_Office = new JMenuItem("Office-Zwischenablage");
        bearbeiten.add(jm_bearbeiten_Office);
        JMenuItem jm_bearbeiten_einfuegen = new JMenuItem("Einfügen");
        bearbeiten.add(jm_bearbeiten_einfuegen);
        JMenuItem jm_bearbeiten_inhalte = new JMenuItem("Inhalte einfügen");
        bearbeiten.add(jm_bearbeiten_inhalte);
        JMenuItem jm_bearbeiten_hyperlink = new JMenuItem("Als hyperlink einfügen");
        bearbeiten.add(jm_bearbeiten_hyperlink);
        JMenuItem jm_bearbeiten_loeschen = new JMenuItem("Löschen");
        bearbeiten.add(jm_bearbeiten_loeschen);
        JMenuItem jm_bearbeiten_markieren = new JMenuItem("Alles markieren");
        bearbeiten.add(jm_bearbeiten_markieren);
        JMenuItem jm_bearbeiten_suchen = new JMenuItem("Suchen...");
        bearbeiten.add(jm_bearbeiten_suchen);
        JMenuItem jm_bearbeiten_ersetzen = new JMenuItem("Ersetzen...");
        bearbeiten.add(jm_bearbeiten_ersetzen);
        JMenuItem jm_bearbeiten_gehe = new JMenuItem("Gehe zu...");
        bearbeiten.add(jm_bearbeiten_gehe);
        JMenuItem jm_bearbeiten_verkn = new JMenuItem("Verknüpfungen...");
        bearbeiten.add(jm_bearbeiten_verkn);
        JMenuItem jm_bearbeiten_objekt = new JMenuItem("Objekt");
        bearbeiten.add(jm_bearbeiten_objekt);

        menubar.add(bearbeiten);

        frame.add(menubar, BorderLayout.NORTH);

        JTextArea jt = new JTextArea();

        frame.add(jt, BorderLayout.CENTER);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);





    }

    public static void main(String[] args) {
        EditorSimple es = new EditorSimple();
    }
}
