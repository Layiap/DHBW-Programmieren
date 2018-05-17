package de.dhbwka.java.probeklausur;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player[] players;

    public Game(Board board, Player[] players) {
        this.board = board;
        this.players = players;
    }

    public void start() {
        Scanner s = new Scanner(System.in);

        boolean spielende = false;

        do {
            for (Player p : this.players) {
                System.out.println("Player: " + p.getName() + ", " + p.getRemainingPoints() + " points remaining");
                System.out.print("Enter visit: ");

                String[] foo = s.next().split(" ");
                Field[] f = new Field[foo.length];


                for (int i = 0; i < foo.length; i++) {
                    f[i] = this.board.parseField(foo[i]);
                }
                // Visit mit den getroffenen Werten anlegen
                Visit v = new Visit(f);
                if (p.addVisit(v)){
                    if (v.getValue() <= 0) {
                        spielende = true;
                    }
                    System.out.println("Scored: " + v.getValue());
                }
            }

        } while (spielende);
        s.close();
    }
}
