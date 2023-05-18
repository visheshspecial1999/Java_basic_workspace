package Java_programs;
import java.util.Scanner;//7.WAP TO PRINT NUMBER B/W 20 TO 10.
class q7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the upper limit:");
		int a=s.nextInt();
		System.out.print("enter the lower limit:");
		int b=s.nextInt();
		System.out.print("the number between a and b is: ");
		for(int i=a;i>=b;i--)
		{System.out.println(i);}

	}

}
