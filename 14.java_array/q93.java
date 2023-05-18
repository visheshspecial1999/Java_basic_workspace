package Java_Array;

import java.util.Scanner;
//93.WAP TO CALCULATE SUM OF ODD INDEX VALUES.
public class q93 {
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
			{if(i%2!=0)
			{
			sum=sum+ar[i];
			}
			}
		System.out.print("the sum of odd index values is :"+sum);

}
}
