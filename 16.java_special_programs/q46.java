package Java_programs;
//6.TRACING FOR FACTORIAL PROGRAM 4,6.
import java.util.Scanner;
public class q46 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter first number :");
		int a=s.nextInt();
		System.out.print("enter second number :");
		int b=s.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{fact=fact*i;}
		System.out.println("the factorial of first  number is :"+fact);
		int fact1=1;
		for(int i=1;i<=b;i++)
		{fact1=fact1*i;}
		System.out.print("the factorial of first  number is :"+fact1);
	}

}
