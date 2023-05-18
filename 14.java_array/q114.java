package Java_Array;
//114.wap to print only first half of the array elements.
import java.util.Scanner;
public class q114 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("enter array size :");
	int a=s.nextInt();
	int ar[]=new int[a];
	System.out.println("enter array elements :");
	int count=0;
	for(int i=0;i<a;i++)
	{
	 ar[i]=s.nextInt(); 
	}
	System.out.print("The half array elements are :");
	for(int i=0;i<ar.length/2;i++)
	{System.out.print(ar[i]+" ");
	}
	}

}
