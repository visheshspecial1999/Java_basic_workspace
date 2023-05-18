package Java_Array;

import java.util.Scanner;

//102.AFTER READING BASED ON THE INDEX VALUE REMOVE THE ELEMENT PRESENT IN AN ARRAY AND 
//RETURN THE REVISED ARRAY.
public class q102 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter array size :");
		int n1=s.nextInt();
		String ar[]=new String[n1];
		System.out.print("enter any type of elements in array :");
		for(int i=0;i<ar.length;i++)
		{ar[i]=s.next();}
		System.out.print("enter the index value at which you want to replace the  array element:");
		int n2=s.nextInt();
		System.out.print("enter the value which you want to update :");
		String n3=s.next();
		for(int i=0;i<n1;i++)
		{if(i==n2) 
		{ar[i]=n3;
		}
		}
		for(int i=0;i<n1;i++)
		{System.out.print(ar[i]+" ");}
	}

}
