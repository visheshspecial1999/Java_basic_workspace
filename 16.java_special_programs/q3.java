package Java_programs;//3.WAP TO PRINT GOODMORNING WHEN THE NO IS 8.
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter your passcode:");
		int i=s.nextInt();
		if(i==8)
		{System.out.print("GOODMORNING");
		}
		else
		{System.out.print("wrong passcode please try again");
		}
		}
	}