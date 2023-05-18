package Java_Array;
//107.WAP TO FIND THE SECOND SMALLEST ELEMENT IN AN ARRAY.
import java.util.Scanner;

public class q107  {
		public static void main(String [] args)
		{
			Scanner s=new Scanner(System.in);
			 System.out.print("enter array size :");
			 int a=s.nextInt();
			 System.out.print("enter  array elements :");
			 int ar[]=new int[a];
			 for(int i=0;i<a;i++)
			 {ar[i]=s.nextInt();}
			 for(int j=0;j<ar.length;j++)
			 {for(int i=0;i<ar.length-1;i++)
			 {if(ar[i]>ar[i+1])
			 {
			 	int temp=ar[i];
			 	ar[i]=ar[i+1];
			 	ar[i+1]=temp;
			 }
				 
			 }
			 }
		
			 
			System.out.println("the second largest element is :"+ar[1]);
			
		}

}