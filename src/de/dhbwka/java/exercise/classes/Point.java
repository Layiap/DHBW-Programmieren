package de.dhbwka.java.exercise.classes;

/*
Matthias Häfele
TINF17B5
15.02.2018
*/

public class Point {
    private double x_koordinate;
    private double y_koordinate;

    public Point() {
        this.x_koordinate = 0.0;
        this.y_koordinate = 0.0;
    }

    public Point(double x_koordinate, double y_koordinate) {
        this.setX_koordinate(x_koordinate);
        this.setY_koordinate(y_koordinate);
    }

    // Statische Methode da nicht auf das eigene Objekt bezogen
    public static double getAbstand (Point p1, Point p2) {
        double diff_y = p1.getY_koordinate() - p2.getY_koordinate();
        double diff_x = p1.getX_koordinate() - p2.getX_koordinate();

        return Math.sqrt((Math.pow(diff_y, 2.0)) + Math.pow(diff_x, 2.0));
    }

    // Statische Methode da nicht auf das eigene Objekt bezogen
    public static double getUrsprung (Point p) {
        // Berechnet den Abstand zum Ursprung nach Pytagoras
        return Math.sqrt((Math.pow(p.getX_koordinate(), 2.0)) + (Math.pow(p.getY_koordinate(), 2.0)));
    }

    // Statische Methode da nicht auf das eigene Objekt bezogen
    public static Point getSpiegelPunkt_X (Point p) {
        // Berechnet Spiegelpunkt an der X Achse
        return new Point(p.getY_koordinate() * -1.0, p.getX_koordinate());
    }

    // Statische Methode da nicht auf das eigene Objekt bezogen
    public static Point getSpiegelPunkt_Y (Point p) {
        // Berechnet Spiegelpunkt an der Y Achse
        return new Point(p.getY_koordinate(), p.getX_koordinate() * -1.0);
    }

    // Statische Methode da nicht auf das eigene Objekt bezogen
    public static Point getSpiegelPunkt (Point p) {
        // Berechnet Spiegelpunkt an der Y Achse
        return new Point(p.getY_koordinate() * -1.0, p.getX_koordinate() * -1.0);
    }

    public double getX_koordinate() {
        return this.x_koordinate;
    }

    public double getY_koordinate() {
        return this.y_koordinate;
    }

    public void setX_koordinate(double x_koordinate) {
        this.x_koordinate = x_koordinate;
    }

    public void setY_koordinate(double y_koordinate) {
        this.y_koordinate = y_koordinate;
    }

    @Override
    public String toString() {
        return "( " + this.x_koordinate + " | " + this.y_koordinate + " )";
    }

    //Main zu Testzwecken
    public static void main(String[] args) {
        Point a = new Point(4.0, 2.0);
        Point b = new Point(-1.0, -1.0);

        System.out.println("Punkt A: " + a + " Abstand zum Ursprung: " + Point.getUrsprung(a) + " Spiegelung am Ursprung: " + Point.getSpiegelPunkt(a));
        System.out.println("Punkt B: " + b + " Abstand zum Ursprung: " + Point.getUrsprung(b) + " Spiegelung am Ursprung: " + Point.getSpiegelPunkt(b));
        System.out.println("Abstand zwischen A und B: " + Point.getAbstand(a, b));

    }
}
