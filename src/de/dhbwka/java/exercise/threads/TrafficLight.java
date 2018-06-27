package de.dhbwka.java.exercise.threads;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class TrafficLight extends JFrame implements Runnable{

    public LightPhase lp;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Ampelgehäuse
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 250, 650);

        // Fassung für Ampellicht oben
        g.setColor(Color.WHITE);
        g.fillOval(100, 100, 150, 150);

        // Fassung für Ampellicht mitte
        g.fillOval(100, 300, 150, 150);

        // Fassung für Ampellicht unten
        g.fillOval(100, 500, 150, 150);

        // Lichter
        if (lp != null) {

            // Aktiviert Rotes Licht
            if (lp.isRed()) {
                g.setColor(Color.RED);
                g.fillOval(105, 105, 140, 140);
            }

            // Aktiviert Gelbes Licht
            if (lp.isYellow()) {
                g.setColor(Color.YELLOW);
                g.fillOval(105, 305, 140, 140);
            }

            // Aktiviert Grünes Licht
            if (lp.isGreen()) {
                g.setColor(Color.GREEN);
                g.fillOval(105, 505, 140, 140);
            }

        }
    }

    public TrafficLight () {
        super("Ampel");

        this.setSize(500, 900);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TrafficLight tf = new TrafficLight();
        tf.setVisible(true);


        Thread runner = new Thread(tf);
        runner.start();
    }

    @Override
    public void run() {
        lp = new LightPhase("red", true, false, false, 3000);

        // Die Ampel läuft immer
        while (true) {
            try {
                // Wartezeit
                sleep(lp.getDuration());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            repaint();

            // Nächste Ampelphase
            lp = lp.getNext();
        }
    }

    public class LightPhase {

        private String name;
        private boolean red;
        private boolean yellow;
        private boolean green;
        private int duration;
        private LightPhase next;

        public LightPhase(String name, boolean red, boolean yellow, boolean green, int duration) {
            this.name = name;
            this.red = red;
            this.yellow = yellow;
            this.green = green;
            this.duration = duration;
        }

        public LightPhase getNext() {

            // Rot Gelb Phase
            if (red && !yellow && !green) {
                next = new LightPhase("rotgelb", true, true, false, 3000);
            }

            //Grün Phase
            if (red && yellow && !green) {
                next = new LightPhase("gruen", false, false, true, 7000);
            }

            // Gelb Phase
            if (!red && !yellow && green) {
                next = new LightPhase("gelb", false, true, false, 3000);
            }

            // Rot Phase
            if (!red && yellow && !green) {
                next = new LightPhase("rot", true, false, false, 7000);
            }

            return this.next;
        }

        public boolean isRed() {
            return red;
        }

        public boolean isYellow() {
            return yellow;
        }

        public boolean isGreen() {
            return green;
        }

        public int getDuration() {
            return duration;
        }
    }
}


