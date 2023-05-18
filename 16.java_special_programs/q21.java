package Java_programs;
import java.util.Scanner;//21.WAP TO CALCULATE SUM OF EVEN DIGITS IN A NUMBER.
public class q21 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int a=sr.nextInt();
		int sum=0;
		while(a>0)
		{int re=a%10;
		{
		if(re%2==0)
		 sum=sum+re;
		}
		 a=a/10;
		}
		System.out.println("the sum of only even digits of a given number is :"+sum);

	}

}
