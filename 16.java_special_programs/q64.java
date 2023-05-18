package Java_programs;
import java.util.Scanner; // 64.WAP TO PRINT FIBONACCI NUMBER SERIES UPTO 10 DIGITS
public class q64 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number of terms:");
		long n=s.nextLong();
		long a=0;
		long b=1,c;
		if(n==1)
		{
			System.out.println(a);
		}
		else if(n>1)
		{
			System.out.println(a);
			System.out.println(b);
		}
		for(long i=2;i<n;i++)
		{
		c=a+b;
		a=b;
		b=c;
		System.out.println(b);
		}

	}
}