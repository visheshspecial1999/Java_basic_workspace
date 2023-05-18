package Java_programs;
import java.util.Scanner;//51. DESIGN A METHOD TO RETURN SQUARE OF THE NO
public class q51 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int a=s.nextInt();
		System.out.println("the square of given number is :"+sqr(a));

	}
	public static int sqr(int x)
	{int y=x*x;
	return y;
	}

}
