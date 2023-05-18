package Java_programs;
import java.util.Scanner;//36.WAP TO PRINT DIVISORS OF 10.
public class q36 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int a=s.nextInt();
		System.out.print("enter the number of times of devisior");
		int b=s.nextInt();
		System.out.println("the devisior of given number are :");
		for(int i=1;i<=b;i++)
		{System.out.println(a*i);}

	}

}
