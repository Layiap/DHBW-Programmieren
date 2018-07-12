package de.dhbwka.java.probeklausur2;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Question> questionPool;
    private int questionsCount;
    private ArrayList<GameClient> clients;

    public Game(List<Question> questionPool, int anzFragen) throws GameException {
        clients = new ArrayList<GameClient>();

        if (questionPool.size() < anzFragen) {
            throw new GameException();
        }

        this.questionPool = questionPool;
        this.questionsCount = anzFragen;
    }

    public void registerClient(GameClient client) {
        clients.add(client);
    }

    public int getQuestionsCount() {
        return questionsCount;
    }

    public void startGame() {

    }

    public void answerSelected(GameClient client, int index) {
        client.setAnswerState(index, Status.ACTIVE);
    }

    public Question getQuestion() {
        questionsCount--;
        return questionPool.get(questionsCount);
    }
}
