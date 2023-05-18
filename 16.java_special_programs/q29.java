package Java_programs;
import java.util.Scanner;//29.WAP TO CHECK WHETHER THE NUMBER IS PALINDROME OR NOT.
public class q29 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int a=sr.nextInt();
		int sum=0;
		int a1=a;
		while(a>0)
		{int re=a%10;
		 sum=sum*10+re;
		 a=a/10;
		}
		if(sum==a1)
		{
		System.out.print("the number is palidrome ");
		}
		else
		{System.out.print("the number is not palidrome ");
		}

	}

}
