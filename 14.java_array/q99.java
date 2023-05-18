package Java_Array;
import java.util.Scanner;//99.WAP TO INSERT THE VALUE TO THE SPECIFIED INDEX FOR AN EXISTING ARRAY.
public class q99 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ente array size :");
		int a=s.nextInt();
		System.out.print("enter array elements ");
		int ar[]=new int[a];
		for(int i=0;i<a;i++)
		{ar[i]=s.nextInt();}
		System.out.println("enter the index number at which you want to enter the element :");
		int b=s.nextInt();
		int ar1[]=new int[a+1];
		System.out.print("enter the new element for array :");
		int c=s.nextInt();
		for(int i=0;i<a;i++)
		{if(i<b)
			{ar1[i]=ar[i];}
		else if(ar[i]==b)
			{ar1[i]=c;}
		else
		{ar1[i+1]=ar[i];}
		
	  }
		for(int i=0;i<a+1;i++)
		{
		System.out.println(ar1[i]);
		}
		
	}

}