package Java_programs;
import java.util.Scanner;//38.WAP TO PRINT THE NO B/W 1 TO 100 WHICH IS DIVISIBLE BY ONLY 9.
public class q38 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the starting number :");
		int a=s.nextInt();
		System.out.print("enter the ending number :");
		int b=s.nextInt();
		System.out.println("number devisible by 3 and 9 are :");
		for(int i=a;i<=b;i++)
		{if((i%9==0))
		{System.out.println(i);
		}
	}

	}

}
