package de.dhbwka.java.probeklausur2;

import javax.swing.*;
import java.awt.*;

public class GameTerm extends Thread implements GameClient {

    private JFrame jFrame;
    private String playerName;
    private Game game;
    private int points;

    private JLabel question;
    private JLabel seconds;
    private JButton answerA;
    private JButton answerB;
    private JButton answerC;
    private JButton answerD;


    public GameTerm(String playerName, Game game) {
        this.playerName = playerName;
        this.game = game;


        jFrame = new JFrame(this.getPlayerName());
        jFrame.setSize(600, 300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel labels = new JPanel();

        for (int i = 0; game.getQuestionsCount() > i; i++) {

            QuestionNumberLabel label = new QuestionNumberLabel("" + (i+1));
            label.setSize(30, 15);

            labels.add(label);
        }

        question = new JLabel("question");
        seconds = new JLabel("seconds");

        JPanel buttons = new JPanel(new GridLayout(2, 2, 6, 3));
        answerA = new JButton("N/A");
        answerB = new JButton("N/A");
        answerC = new JButton("N/A");
        answerD = new JButton("N/A");

        buttons.add(answerA);
        buttons.add(answerB);
        buttons.add(answerC);
        buttons.add(answerD);

        panel.add(labels);
        panel.add(question);
        panel.add(seconds);
        panel.add(buttons);

        jFrame.add(panel, BorderLayout.NORTH);
        jFrame.setVisible(true);

        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        int seconds;
        int questionIndex = 0;

        while (this.game.getQuestionsCount() > questionIndex) {

            this.setQuestion(questionIndex, this.game.getQuestion());
            questionIndex++;

            seconds = 10;
            while (seconds >= 0) {

                try {
                    this.setRemainingSeconds(seconds);
                    Thread.sleep(1000);
                    seconds--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        this.gameIsOver();
    }

    @Override
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void setQuestion(int questionIndex, Question q) {
        question.setText(q.getQuestionText());

        answerA.setText(q.getAnswerA());
        answerB.setText(q.getAnswerB());
        answerC.setText(q.getAnswerC());
        answerD.setText(q.getAnswerD());
    }

    @Override
    public void setRemainingSeconds(int seconds) {
        this.seconds.setText("" + seconds);
    }

    @Override
    public void gameIsOver() {
        JOptionPane.showMessageDialog(jFrame, "Game Finished");
    }

    @Override
    public void setAnswerState(int questionIndex, Status status) {

    }
}
