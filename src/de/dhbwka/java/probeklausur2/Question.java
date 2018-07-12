package de.dhbwka.java.probeklausur2;

public class Question {

    private String questionText;
    private String[] answers;
    private int correctIndex;

    public Question(String questionText, String[] answers, int correctIndex) {
        this.questionText = questionText;
        this.answers = answers;
        this.correctIndex = correctIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getAnswerA() {
        return answers[0];
    }

    public String getAnswerB() {
        return answers[1];
    }

    public String getAnswerC() {
        return answers[2];
    }

    public String getAnswerD() {
        return answers[3];
    }
}
