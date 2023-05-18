package Java_programs;//1.WAP TO CHECK WHETHER NUMBER IS POSITIVE OR NOT
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("enter eny number to check:");
	int i=s.nextInt();
	if(i>0)
	{System.out.print("Number is positive");
	}
	else if(i<0)
	{System.out.print("Number is negative");}
	else
	{System.out.print("Number is neighter positive nor negative");
	}
	}
}
