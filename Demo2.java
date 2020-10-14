
public class Demo2 {

	int[] array= {12,4,7,3,2};
	void oddArray()
	{
		for(int i=0;i<5;i++)
		{
		  System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("odd element of array: ");
		for(int i=0;i<5;i++)
		{
			if(array[i]%2!=0)
			{
				System.out.print(array[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.oddArray();
	}

}
