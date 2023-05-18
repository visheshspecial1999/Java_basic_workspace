package Java_programs;
import java.util.Scanner;//12.WAP TO CALCULATE SUM OF NUMBER B/W 1 TO 5
public class q12 {
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter the first number:");
		int a=sr.nextInt();
		System.out.print("enter the last number:");
		int b=sr.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++)
		{sum=sum+i;}
		System.out.println("the sum of numbers between a and b is:"+sum);
	}

}
