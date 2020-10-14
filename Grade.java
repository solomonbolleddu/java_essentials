import java.util.Scanner;

public class Grade {
    int sum=0;
    int[] marks=new int[5];
//getting the grade from user
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects : ");
        for(int i=0;i<5;i++) {
            marks[i] = sc.nextInt();
            sum=sum+marks[i];
        }
    }
// showing the grade
    void display()
    {
        double percentage=sum/5;
        System.out.println(percentage);
        char grade=grade(percentage);
        System.out.println("Grade : "+ grade);
        System.out.println("percentage : "+percentage+ "%");
    }
//using else if function to check the grade
     char grade(double percentage) {
        if(percentage>=90)
            return 'A';
        else if(percentage>=70)
            return 'B';
        else if(percentage>=60)
            return 'C';
        else if(percentage>=50)
            return 'D';
        else if(percentage>=40)
            return 'E';
        else
            return 'F';
    }
    public static void main(String[] args)
    {
        Grade g=new Grade();
        g.read();
        g.display();

    }
}