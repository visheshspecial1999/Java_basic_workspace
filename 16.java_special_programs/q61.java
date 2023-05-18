package Java_programs;
import java.util.Scanner;
//61.DESIGN A METHOD TO COUNT NO OF DIGITS IN A NUMBER.
public class q61 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter any integer number: ");
		int a=s.nextInt();
		int count=0;
		while(a>0)
		{a=a/10;
		count++;	
		}
		System.out.println("total number of digits in enterd number is : "+count);
	}
}