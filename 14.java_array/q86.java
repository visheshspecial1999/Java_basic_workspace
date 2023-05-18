package Java_Array;
/*86.DESIGN A METHOD TO CREATE AN ARRAY AND READ ARRAYELEMENTS FROM THE USER AND 
RETURN IT.*/
import java.util.Scanner;
public class q86 {
	static String[] crateArray(int size)
	{Scanner s=new Scanner(System.in);
	String ar[]=new String[size];
	System.out.println("Enter the array elements :");
	for(int i=0;i<ar.length;i++)
	{ar[i]=s.nextLine();}
	return ar;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("----Here you can enter any type of array element----");
		System.out.print("enter array size ");
		int s1=s.nextInt();
	String r[]=crateArray(s1);
	for(int i=0;i<r.length;i++)
	{System.out.print(r[i]+" ");
	}
	}

	}