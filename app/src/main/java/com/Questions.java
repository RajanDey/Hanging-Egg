package com;

public class Questions {

    public String mQuestions[] = {
            "What year did Albert Einstein die?",
            "Which is the largest planet in the solar system?",
            "How many Presidents have there been of the USA? ",
            "What colour is Cerulean?",
            "What are a group of Dolphins called?",
            "Who invented Penicillin?",
            "What date was President John F Kennedy assassinated?",
            "How many men have walked on the moon?",
            "Who has won the most Academy Awards?",
            "What is the currency of Brazil?"
    };

    private String mChoices [][] = {
            {"1954","1949","1960","1955"},
            {"Jupiter","Neptune","Earth","Mars"},
            {"36","29","46","45"},
            {"Red","Blue","Yellow","Green"},
            {"School","Herd","Pod","Pool"},
            {"Alexandra Fleming","Thomas Edison","Marie Curie","George Orwell"},
            {"November 22 1962","November 22 1963","October 29 1964","November 24 1962"},
            {"10","5","12","9"},
            {"James Cameron","Walt Disney","Katherine Hepburn","Steven Spielberg"},
            {"Dollar","Dinar","Real","Krona"}

    };

    private String mCorrectAnswers[]={"1955","Jupiter","45","Blue","Pod","Alexandra Fleming","November 22 1963","12","Walt Disney","Real"};

    public String getQuestion (int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1 (int a) {
        String choice = mChoices [a][0];
        return choice;
    }

    public String getChoice2 (int a) {
        String choice = mChoices [a][1];
        return choice;
    }

    public String getChoice3 (int a) {
        String choice = mChoices [a][2];
        return choice;
    }

    public String getChoice4 (int a) {
        String choice = mChoices [a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
     String answer = mCorrectAnswers[a];
     return answer;
    }
}
