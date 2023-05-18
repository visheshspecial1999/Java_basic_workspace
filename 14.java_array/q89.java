package Java_Array;

import java.util.Scanner;

//89.WAP TO FIND THE SMALLEST VALUE IN AN ARRAY.
public class q89 {
	public static void main(String [] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.print("enter the aray size :");
	int a=s.nextInt();
	int ar[]=new int[a];
	System.out.print("enter elements of array :");
	for(int i=0;i<a;i++)
	{ar[i]=s.nextInt();
	}
	int sml=ar[0];
	for(int i=1;i<a;i++)
	{if(sml>ar[i])
	{sml=ar[i];
	}
	}
	System.out.print("the smallest number is:"+sml);
	}
}