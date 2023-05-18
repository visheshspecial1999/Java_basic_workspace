package Java_programs;
import java.util.Scanner;//24.WAP TO SWAP TWO NUMBERS WITHOUT USING TEMP VARIABLE.
public class q24 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter the first integer number :");
		int a=sr.nextInt();
		System.out.print("enter the second integer number :");
		int b=sr.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the first integer number after swapping is :"+a);
		System.out.println("the second integer number after swapping is :"+b);
	}
}
