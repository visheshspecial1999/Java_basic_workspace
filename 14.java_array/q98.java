package Java_Array;

import java.util.Scanner;

//98. WAP TO COPY THE ARRAY ELEMENTS IN REVERSE ORDER AND PRINT IT.
public class q98 {
	public static void main(String[] args) {
		System.out.print("enter the size of array :");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int ar[]=new int[a];
		System.out.print("enter the array elements :");
		for(int i=0;i<ar.length;i++)
		{ar[i]=s.nextInt();
		}
		System.out.print("the first array is :ar=[");
		for(int i=0;i<a;i++)
			{
			System.out.print(ar[i]+" ");
			}
			System.out.println("]");
		int ar1[]=new int [a];
		System.out.print("the copied array is :ar1=[");
		for(int i=0;i<a;i++)
			{
			ar1[i]=ar[a-i-1];
			System.out.print(ar1[i]+" ");
			}
			System.out.print("]");

}
}