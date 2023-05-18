package Java_programs;
import java.util.Scanner;//13.WAP TO CALCULATE SUM OF EVEN NO B/W 1 TO 10 WITH TRACING
public class q13 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter the first number:");
		int a=sr.nextInt();
		System.out.print("enter the last number:");
		int b=sr.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++)
		{if(i%2==0)
			{sum=sum+i;}
		}
		System.out.println("the sum of even numbers between a and b is:"+sum);
	}

}
