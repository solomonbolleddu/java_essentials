package com.quizapp;
import java.util.Scanner;
public class Question {
    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correct_Answer_is;
    int user_given_Answer;

    public boolean ask_a_Question()
    {
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("please choose an option and no looking up in the internet");
        user_given_Answer=sc.nextInt();
        if (user_given_Answer==correct_Answer_is){
            return true;
        }
        return false;
    }
}
