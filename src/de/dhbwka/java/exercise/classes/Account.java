package de.dhbwka.java.exercise.classes;

/*
Matthias Häfele
TINF17B5
15.02.2018

Info: Die Kontonummern werden von der Account Klasse selbst verwaltet
*/

public class Account {

    private int kontonummer;
    private String kontoinhaber;
    private double kontostand;
    private double dispo;

    private static int kundenanzahl = 0;
    private static int KN_NUMMERN;

    public Account(String kontoinhaber, double kontostand, double dispo) {
        this.kontoinhaber = kontoinhaber;
        this.kontostand = kontostand;
        this.dispo = dispo;

        // Kontonummer für den Kunden generieren
        if (kundenanzahl == 0) KN_NUMMERN = (int)(Math.random() * 1000000000);
        this.kontonummer = KN_NUMMERN + kundenanzahl;
        kundenanzahl++;
    }

    public void einzahlung(double betrag) {
        if (betrag < 0) {
            // Es kann kein negativer Beitrag eingezahlt werden
            System.out.println("Fehler bei der Buchung");
        } else {
            // Einzahlung Buchen
            this.kontostand += betrag;
        }
    }

    public void auszahlung(double betrag) {
        if (betrag < 0) {
            // Bei der Auszahlung wird der Betrag des Betrages verwendet
            betrag = betrag * -1;
            System.out.println("Auszahlungsbetrag wurde korrigiert auf: " + betrag);
        }
        if ((this.kontostand - betrag) < this.dispo) {
            System.out.println("Deckung nicht ausreichen!");
        } else {
            // auszahlung buchen Buchen
            this.kontostand -= betrag;
        }
    }

    public double getKontostand() {
        return kontostand;
    }

    @Override
    public String toString() {
        return "Kontoinhaber: " + this.kontoinhaber +
                " Kontonummer: " + this.kontonummer +
                " Saoldo: " + this.kontostand +
                " Limit: " + this.dispo;
    }

    // Main Methode zu Testzwecken
    public static void main(String[] args) {
        Account[] konten = new Account[5];
        konten[0] = new Account("Frida", 3000.0, -1000.0);
        konten[1] = new Account("Lorenz", 298.1, -1000.0);
        konten[2] = new Account("Leonie", 1786542653.43, -100000.0);
        konten[3] = new Account("Moritz", 7653, -500.0);
        konten[4] = new Account("Franziska", 0.21, 0.0);

        konten[3].auszahlung(3000.00);
        konten[4].einzahlung(100.00);

        // Ausgabe aller Konten
        for (Account a : konten) {
            System.out.println(a);
        }
    }
}
