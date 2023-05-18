package Java_Array;
import java.util.Scanner;//80.WAP TO PRINT THE EVEN ARRAY ELEMENTS IN AN ARRAY.
public class q80 {
	public static void main(String [] args)
	{
	System.out.print("enter the size of array :");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int ar[]=new int[a];
	System.out.println("enter the array elements :");
	for(int i=0;i<ar.length;i++)
	{ar[i]=s.nextInt();
	}
	System.out.print("the even elements of array are :");
	for(int i=0;i<a;i++)
	{if(ar[i]%2==0)
		{
		System.out.println(ar[i]);
		}

}
}
}