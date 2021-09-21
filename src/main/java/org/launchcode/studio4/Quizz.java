package org.launchcode.studio4;


import java.util.ArrayList;
import java.util.Scanner;

public class Quizz {
    private ArrayList<Question> questionsArr = new ArrayList<Question>();
    private int numberCorrectQuestions =0;
    Scanner scanner = new Scanner(System.in);

    //constructor
    public Quizz(){}

    //Methods

    public void addQuestion(Question question){
        this.questionsArr.add(question);
    }

    public void runQuiz(){
        for(Question question : questionsArr){
            System.out.println(question.getQuestion());
            String userAnswer = this.getUserAnswer();
            boolean userGotCorrectAnswers = question.checkAnswers(userAnswer);

            if(userGotCorrectAnswers){
                this.numberCorrectQuestions++;
            }
        }
        //grade the quizz

        double percentageCorrect = ((double) this.numberCorrectQuestions/(double) this.questionsArr.size()) * 100;
        System.out.println("The user garde is: " + percentageCorrect + "%");
    }

    private String getUserAnswer(){
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }
}



