package org.launchcode.studio4;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswers(String answer) {
        String actualAnswer = this.getAnswer();
        if(answer.equalsIgnoreCase(actualAnswer)){
            return true;
        }else{
            return false;
        }
    }
}
