package Java_programs;
import java.util.Scanner;//9.WAP TO PRINT ODD NO B/W 1 TO 10
public class q9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the starting number:");
		int a=s.nextInt();
		System.out.print("enter the ending number:");
		int b=s.nextInt();
		System.out.print("the odd number between a and b is: ");
		for(int i=a;i<=b;i++)
		{if(i%2!=0)
			System.out.println(i);
		}
	}
}
