package Java_Array;

import java.util.Scanner;// sq1 create string array by method print only nth element from last

public class sq1 {
	static String crateArray(int size)
	{Scanner s=new Scanner(System.in);
	String ar[]=new String[size];
	System.out.println("Enter the array elements :");
	for(int i=0;i<ar.length;i++)
	{ar[i]=s.nextLine();}
	System.out.print("enter the element position to return that nuber from array :");
	int n1=s.nextInt();
	return ar[ar.length-n1];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter array size:");
		int s1=s.nextInt();
		String r=crateArray(s1);
	
	System.out.println(r);
	
	}

	}