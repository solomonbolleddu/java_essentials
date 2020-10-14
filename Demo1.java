import java.util.Scanner;

public class Demo1 {

	String  name,power,weapon,planet;
	int age;
	static int count=0,count2=0;
	void getDetails()
	{
		count++;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter name of the avenger "+count+" : ");
		name=sc.nextLine();
		System.out.println("enter age of the avenger: ");
		age=sc1.nextInt();
		System.out.println("enter power of the avenger "+count+" : ");
		power=sc.nextLine();
		System.out.println("enter weapon of the avenger "+count+" : ");
		weapon=sc.nextLine();
		System.out.println("enter planet of the avenger "+count+" : ");
		planet=sc.next();
		System.out.println();
		if (count==5)
		{
			sc.close();
			sc1.close();
		}
		
	}
	void displayDetails()
	{
		count2++;
		System.out.println("Name of the avenger "+count2+" : "+name);
		System.out.println("Age of "+name+" : "+age);
		System.out.println("Power of "+name+" : "+power);
		System.out.println("Weapon of "+name+" : "+weapon);
		System.out.println("Planet of "+name+" : "+planet);
		System.out.println();
	}
	public static void main(String[] args) {
		Demo1[] avengers=new Demo1[5];
		for(int i=0;i<5;i++)
		{
			avengers[i]=new Demo1();
			avengers[i].getDetails();
		}
		for(int i=0;i<5;i++)
		{
			avengers[i].displayDetails();
		}
	}
}
