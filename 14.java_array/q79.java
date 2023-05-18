package Java_Array;
import java.util.Scanner;//79.WAP TO PRINT ARRAY ELEMENTS IN REVERSE ORDER.
public class q79 {

	public static void main(String[] args) {
		System.out.print("enter the size of array :");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int ar[]=new int[a];
		System.out.println("enter the array elements :");
		for(int i=0;i<ar.length;i++)
		{ar[i]=s.nextInt();
		}
		for(int i=a-1;i>=0;i--)
		{System.out.println(ar[i]);
	}
	}
}
