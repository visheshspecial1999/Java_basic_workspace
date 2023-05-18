package Java_Array;
import java.util.Scanner;
//101.DESIGN A METHOD TO ACCEPT ARRAY AND INDEX VALUE.
public class q101 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter array size :");
		int n1=s.nextInt();
		String ar[]=new String[n1];
		System.out.print("enter any type of elements in array :");
		for(int i=0;i<n1;i++)
		{ar[i]=s.nextLine();}
		System.out.print("enter the index value from which you want to return array element:");
		int n2=s.nextInt();
		for(int i=0;i<n1;i++)
		{if(i-1==n2) 
		{System.out.print("array element is :"+ar[i]);
		}

	}
	}
}
