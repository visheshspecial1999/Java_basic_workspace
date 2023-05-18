package Java_programs;
import java.util.Scanner;//14.WAPT PRINT SUM OF ODD NO B/W 1 TO 10 WITH TRACING.
public class q14 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter the first number:");
		int a=sr.nextInt();
		System.out.print("enter the last number:");
		int b=sr.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++)
		{if(i%2!=0)
			{sum=sum+i;}
		}
		System.out.println("the sum of odd numbers between a and b is:"+sum);

	}

}
