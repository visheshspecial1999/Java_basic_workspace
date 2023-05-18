package Java_programs;
import java.util.Scanner;
public class q28 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int a=sr.nextInt();
		int sum=0;
		while(a>0)
		{int re=a%10;
		 sum=sum*10+re;
		 a=a/10;
		}
		System.out.print("the reversed integr number is :"+sum);
	}

}
