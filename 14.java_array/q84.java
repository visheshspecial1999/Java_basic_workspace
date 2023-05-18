package Java_Array;

import java.util.Scanner;//84.WAP TO CALCULATE SUM OF ODD ELEMENTS IN AN ARRAY.
public class q84 {
	public static void main(String[] args) {
		System.out.print("enter the size of array :");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int ar[]=new int[a];
		System.out.println("enter the array elements :");
		for(int i=0;i<ar.length;i++)
		{ar[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<a;i++)
		{if(ar[i]%2!=0)
			{sum=sum+ar[i];
			}
		}
		System.out.print("the sum of array elements is:"+sum);

	}

}