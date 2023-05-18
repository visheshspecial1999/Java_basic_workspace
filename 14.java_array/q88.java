package Java_Array;
import java.util.Scanner;//88.WAP TO FIND LARGEST ELEMENT IN AN ARRAY.
public class q88 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the aray size :");
		int a=s.nextInt();
		int ar[]=new int[a];
		System.out.print("enter elements of array :");
		for(int i=0;i<a;i++)
		{ar[i]=s.nextInt();
		}
		int big=0;
		for(int i=0;i<a;i++)
		{if(big<ar[i])
		{big=ar[i];
		}
		}
		System.out.print("the biggest number is:"+big);
	}
}