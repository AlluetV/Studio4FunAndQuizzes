package org.launchcode.studio4;

public class QuizzRunner {
    public static void main(String[] args){
        Quizz myQuizz = new Quizz();
        MultipleChoiceQuestion myMultipleQuizz = new MultipleChoiceQuestion("What color are the bananas?\nA purple\nB blue\nC yellow","C");
        myQuizz.addQuestion(myMultipleQuizz);

        CheckBoxQuestion myCheckBoxQuizz = new CheckBoxQuestion("What color are the apples?\nA red\nB black\nC green","A,C");
        myQuizz.addQuestion(myCheckBoxQuizz);

        TrueFalseQuestion myTrueFalseQuizz = new TrueFalseQuestion("An Octopus has three hearts?\nA true\nB false", "A");
        myQuizz.addQuestion(myTrueFalseQuizz);

        ShortQuestion myShortanswerQuizz = new ShortQuestion("Which planer is closer to the sun?","Mercury");

        myQuizz.runQuiz();
    }
}
