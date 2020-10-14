import java.util.Scanner;

public class Day3 {

	String name;
	int age;
	int salary,annualSalary;
	int taxAmount;
	
	void read ()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter age: ");
		age=sc.nextInt();
		System.out.println("Enter salary: ");
		salary=sc.nextInt();
		taxAmount=getTaxAmount(salary);
		sc.close();
	}
	int getTaxAmount(int salary)
	{
		annualSalary=salary*12;
		if(annualSalary>500000)
			return (annualSalary*20)/100;
		else if(annualSalary>400000)
			return (annualSalary*15)/100;	
		else if(annualSalary>300000)
			return (annualSalary*10)/100;	
		else if(annualSalary>200000)
			return (annualSalary*5)/100;
		else 
			return 0;
	}
	void display()
	{
        System.out.println("The employee's name is "+name);
        System.out.println("The employee's age is "+age);
        System.out.println("The employee's annual salary is "+annualSalary);
        System.out.println("The employee's Tax amount is "+taxAmount);
        System.out.println();
	}
	public static void main(String[] args) {
		Day3 d1=new Day3();
		d1.read();
		d1.display();
	}

}