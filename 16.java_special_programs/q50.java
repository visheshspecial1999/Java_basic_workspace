package Java_programs;
import java.util.Scanner;//50.DESIGN A METHOD TO CALCULATE FACTORIAL OF A NUMBER AND RETURN FACTORIAL
public class q50 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter any positive number :");
		int n=s.nextInt();
		int fact2=fact(n);
		System.out.println("the factorial of given number is :"+fact2);

	}
public static int fact(int a)
{int fact1 =1;
	for(int i=1;i<=a;i++)
	{fact1=fact1*i;
}
	return fact1;

}
}
