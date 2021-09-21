package org.launchcode.studio4;

public abstract class Question {

    //fields
    private final String question;
    private final String answer;

    //constructor

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // getter and setters

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    //methods

    public abstract boolean checkAnswers(String answer);
}
