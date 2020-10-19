package com.quizapp;
import java.util.Scanner;
public class Player {
    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails(){
        System.out.println("HI LETS PLAY QUIZ_UP!!!");
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("HERE WE GO");

    }
}