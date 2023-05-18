package Java_programs;
import java.util.Scanner;//31.WAP TO CALCULATE POWER OF A NUMBER.
public class q31 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int a=sr.nextInt();
		System.out.print("enter the power of number :");
		int b=sr.nextInt();
		pow(a,b);
	}
	public static void pow(int x,int y)
	{
		int a1=x;
		for(int i=2;i<=y;i++)
		{
			x=x*a1;
	}
		System.out.print(x);
	}
}