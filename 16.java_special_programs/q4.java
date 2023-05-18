package Java_programs;/*4.WAP TO DISPLAY MESSAGE GOOD MORNING WHEN NUMBER IS 8 AND NUMBER EQUALS TO 10 AND 
NUMBER EQUALS TO 11. */
import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter your primary passcode: ");
		int p1=s.nextInt();
		System.out.print("enter your secondry passcode: ");
		int p2=s.nextInt();
		System.out.print("enter your auxilary passcode: ");
		int p3=s.nextInt();
		if(p1==8&p2==10&p3==11)
		{System.out.print("GOOD MORNING");}
		else
		{System.out.print("wrong passcode please try again");
	}
	}
}
