package org.launchcode.studio4;

public class ShortQuestion extends Question{
    public ShortQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswers(String answer) {
        String actualAnswer = this.getAnswer();

        if(!(answer.length() <= 80)){
            System.out.println("Answer is longer than expected, 80 characters");
            return false;
        }

        if(answer.equalsIgnoreCase(actualAnswer)){
            return true;
        }else{
            return false;
        }
    }

}
