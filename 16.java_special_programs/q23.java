package Java_programs;
import java.util.Scanner;//23.WAP TO FIND LOGIC FOR SWAPPING OF TWO NUMBER.
public class q23 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter first integer number: ");
		int a=sr.nextInt();
		System.out.print("enter second integer number: ");
		int b=sr.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("the first integer number after swapping is :"+a);
		System.out.println("the second integer number after swapping is :"+b);
	}

}
