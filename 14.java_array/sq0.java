package Java_Array;
import java.util.Scanner;//sq0 create string array by method
import java.util.Scanner;
public class sq0 {
		static String[] crateArray(int size)
		{Scanner s=new Scanner(System.in);
		String ar[]=new String[size];
		System.out.println("Enter the array elements :");
		for(int i=0;i<ar.length;i++)
		{ar[i]=s.nextLine();}
		return ar;
		}
		public static void main(String[] args) {
			String r[]=crateArray(4);
		for(int i=0;i<r.length;i++)
		{System.out.println(r[i]);
		}
		}

		}