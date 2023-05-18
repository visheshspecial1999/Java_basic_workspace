package Java_Array;

import java.util.Scanner;
//90.WAP TO PRINT EVEN INDEX VALUES IN AN ARRAY
public class q90 {
	public static void main(String[] args) {
		System.out.print("enter the size of array :");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int ar[]=new int[a];
		System.out.println("enter the array elements :");
		for(int i=0;i<ar.length;i++)
		{ar[i]=s.nextInt();
		}
		System.out.println("the even index value of array is :");
		for(int i=0;i<a;i++)
			{if(i%2==0)
			{
			System.out.println(ar[i]);
			}
			}

}
}