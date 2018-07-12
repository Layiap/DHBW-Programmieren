package de.dhbwka.java.probeklausur2;

import javax.swing.*;

public class QuestionNumberLabel extends JLabel {
    private Status status;

    public QuestionNumberLabel(String title) {
        super(title);

        this.setSize(30, 20);
        this.setOpaque(true);
        this.setHorizontalAlignment(JLabel.CENTER);

        this.setStatus(Status.PENDING);
    }

    public void setStatus(Status status) {
        this.status = status;
        this.setBackground(status.color());
    }
}
