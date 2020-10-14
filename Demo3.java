import java.util.Scanner;

public class Demo3 {

	int[] array= new int[5];
	int sum=0;
	void Read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 elements:");
		for(int i=0;i<5;i++)
		{
			array[i]=sc.nextInt();
			sum+=array[i];
		}
		System.out.println("Sum of entered 5 elements is "+sum);
		sc.close();
	}
	public static void main(String[] args) {
	 Demo3 d=new Demo3();
	 d.Read();
	}

}
