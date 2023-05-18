package Java_programs;
import java.util.Scanner;//25.WAP TO COUNT HOW MANY DIGITS ARE PRESENT IN A NUMBER.
public class q25 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int a=sr.nextInt();
		int count=0;
		while(a>0)
		{a=a/10;
			count++;
		}
		System.out.print("the number of digits in the given number  is :"+count);
	}

}
