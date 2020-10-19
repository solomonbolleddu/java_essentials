package com.quizapp;

public class Game {
    Question[] questions=new Question[5];
    Player player=new Player();

    String[] questions_to_be_asked={"1.How many countries make up Africa?","2.vanilla comes from what flowers?","3.Rome was founded in which year?","4.What planet are Transformers from?","5.How many paintings did Van Gogh sell during his lifetime?"};
    String[] options1={"54","red haddock","934 BC","Despotic","ELEVEN"};
    String[] options2={"35","tulips","672 BC","Cybertron","SIXTEEN"};
    String[] options3={"17","Orchids","829 BC","Galatica","FIVE"};
    String[] options4={"38","blue vanillas","753 BC","Ultras","ONE"};
    int[] answers= {1, 3, 4, 2, 4};
    public void initGame()    {
        for(int i=0;i<5;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<5;i++)
        {

            questions[i].question=questions_to_be_asked[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correct_Answer_is=answers[i];
        }
    }
    public void play()
    {

        player.getDetails();
        for(int i=0;i<5;i++)
        {
            boolean status=questions[i].ask_a_Question();
            if(status==true)
            {
                System.out.println("your playing great \n");
                player.score=player.score+5;
            }
            else{
                System.out.println("I am sorry its the wrong option \n");
                player.score=player.score-5;
            }
        }

        System.out.println(player.name+" ,your final score is "+player.score);

    }
}