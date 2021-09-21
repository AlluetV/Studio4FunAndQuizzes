package org.launchcode.studio4;

public class CheckBoxQuestion extends Question{

    public CheckBoxQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswers(String answer) {
        String actualAnswer = this.getAnswer();
        if(answer.toLowerCase().equals(actualAnswer.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }

}
