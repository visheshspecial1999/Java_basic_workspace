package Java_programs;
import java.util.Scanner;//49.WAP TO CREATE A METHOD TO PERFORM ADDITION OF TWO NOS THEN INSIDE THE MAIN METHOD 
//CHECK THE ADDITION OF TWO NOS IS EVEN OR ODD.
public class q49 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter first number :");
		double d1=s.nextDouble();
		System.out.print("enter second number :");
		double d2=s.nextDouble();
		double d=pass(d1,d2);
		if(d%2==0)
		{System.out.println("the addition of two number is even");
		}
		else
		{System.out.println("the addition of two number is odd");}
	}
	public static  double pass(double x,double y)
	{ double sum=x+y;
	return sum;
	}
}
