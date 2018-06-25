package de.dhbwka.java.exercise.threads;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class DancingText extends JFrame implements Runnable {

    private int col_r = 190;
    private int col_g = 50;
    private int col_b = 255;
    private int col_diff = 1;
    private int time = 0;

    public DancingText() {
        super("Dancing");

        this.setSize(1920, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        DancingText dc = new DancingText();
        dc.setVisible(true);

        Thread thread = new Thread(dc);
        thread.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        String text = "Dance Dance Dance";

        Font courier = new Font ("Consolas", Font.BOLD, 200);
        g.setFont(courier);

        int pos = 20;
        int counter = 0;
        for (char c : text.toCharArray()) {
            g.setColor(randColor());
            g.drawString("" + c, pos, 300 - sinPos(counter, time));
            pos += 110;
            counter++;
            time += 1;
        }


    }

    private Color randColor () {
        col_r += col_diff;
        if (col_r > 255) {
            col_r = 0;
        }
        col_g += col_diff;
        if (col_g > 255) {
            col_g = 0;
        }
        //col_b += col_diff;
        if (col_b > 255) {
            col_b = 0;
        }
        return new Color(col_r , col_g, col_b);
    }

    private int sinPos(int pos, int t) {

        return (int) (Math.sin(pos * 0.5 + t * 0.75) * 50f);
    }


    @Override
    public void run() {
        while (true) {
            try {
                this.repaint();
                sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
