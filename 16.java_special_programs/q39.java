package Java_programs;
import java.util.Scanner;//39.WAP TO PRINT THE NO B/W 1 TO 20 WHICH IS DIVISIBLE BY 2 AND 4.
public class q39 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the starting number :");
		int a=s.nextInt();
		System.out.print("enter the ending number :");
		int b=s.nextInt();
		System.out.println("number devisible by 2 and 4 are :");
		for(int i=a;i<=b;i++)
		{if((i%2==0)&&(i%4==0))
		{System.out.println(i);
		}
	}

}
}
