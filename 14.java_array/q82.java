package Java_Array;

import java.util.Scanner;

//82.WAP TO PRINT ODD ELEMENTS IN AN ARRAY.
public class q82 {

	public static void main(String[] args) {
		System.out.print("enter the size of array :");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int ar[]=new int[a];
		System.out.println("enter the array elements :");
		for(int i=0;i<ar.length;i++)
		{ar[i]=s.nextInt();
		}System.out.print("the odd elements of array are :");
		for(int i=0;i<a;i++)
		{if(ar[i]%2!=0)
			{
			System.out.print(ar[i]+" ");
			}

	}

}
}
