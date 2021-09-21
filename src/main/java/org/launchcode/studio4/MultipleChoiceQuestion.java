package org.launchcode.studio4;

public class MultipleChoiceQuestion extends Question{

    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswers(String answer) {
        String actualAnswer = this.getAnswer();

        return answer.equalsIgnoreCase(actualAnswer);
    }
}
