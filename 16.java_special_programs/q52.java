package Java_programs;
//52.DESIGN A METHOD TO RETURN POWER OF A NO.
import java.util.Scanner;
public class q52 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any integer number: ");
	int a=s.nextInt();
	System.out.println("enter power of number");
	int b=s.nextInt();
	System.out.println(pow(a,b));
	}
	public static int pow(int x,int y)
	{
		int sqr=1;
		while(y>0)
		{sqr=sqr*x;
		y--;	
		}
		return sqr;
	}

}
