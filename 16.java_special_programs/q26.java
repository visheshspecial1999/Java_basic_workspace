package Java_programs;
import java.util.Scanner;//26.WAP TO COUNT EVEN DIGITS IN A NUMBER.
public class q26 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int a=sr.nextInt();
		int count=0;
		while(a>0)
		{int re=a%10;
			a=a/10;
			if(re%2==0)
			{
			count++;
			}
		}
		System.out.print("the number of even digits in the given number  is :"+count);
	}

}
