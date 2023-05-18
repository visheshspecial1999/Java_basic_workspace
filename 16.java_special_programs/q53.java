package Java_programs;
//DESIGN A METHOD TO CALCULATE ADDITION OF ALL DIGITS PRESENT IN A NUMBER AND RETURN 
//THE SUM.
import java.util.Scanner;
public class q53 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int n=s.nextInt();
		int b=m1(n);
		System.out.println("the sum of digits of given number is :"+ b);

	}
	public static int m1(int x)
	{int sum=0;
	 while(x>0)
	 {int rem=x%10;
	  sum=sum+rem;
	  x=x/10;
	 }
	 return sum;
	}

}
