package de.dhbwka.java.probeklausur2;

import java.awt.*;

public enum Status {
    ACTIVE (0, Color.ORANGE),
    CORRECT (1, Color.GREEN),
    WRONG (-1, Color.RED),
    PENDING (0, Color.WHITE),
    NO_ANSWER (0, Color.GRAY);

    private int code;
    private Color color;

    Status(int code, Color color) {
        this.code = code;
        this.color = color;
    }

    Color color() {
        return color;
    }
}
