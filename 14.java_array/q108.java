package Java_Array;
//108.WAP TO DESIGN A METHOD TO RETURN SECOND LARGEST ELEMENT IN AN ARRAY.
import java.util.Scanner;
public class q108 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter array size :");
		int a=s.nextInt();
		System.out.print("enter array elemenets :");
		int ar[] =new int [a];
		for(int i=0;i<a;i++)
		{ar[i]=s.nextInt();}
		int ar1[]=sortArray(ar);
		System.out.print("the second largest element is :"+ar1[1]);
			

	}
	static int [] sortArray(int ar[])
	{
		 for(int j=0;j<ar.length;j++)
		 {for(int i=0;i<ar.length-1;i++)
		 {if(ar[i]<ar[i+1])
		 {
		 	int temp=ar[i];
		 	ar[i]=ar[i+1];
		 	ar[i+1]=temp;
		 }
			 
		 }
		 }
		 return ar;
	}
}
