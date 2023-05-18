package Java_Array;

import java.util.Scanner;
//96.WAP TO CALCULATE AVERAGE OF ALL ARRAY ELEMENTS.
public class q96 {
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
			{
			sum=sum+ar[i];
			}
		System.out.print("the average of all array values is :"+sum/a);
	}
}