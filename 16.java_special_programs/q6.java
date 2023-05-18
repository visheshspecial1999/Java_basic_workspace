package Java_programs;
import java.util.Scanner;//6.WAP TO PRINT NUMBER BETWEEN 1 TO 10
public class q6 {
	public static void main(String [] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.print("enter the starting number:");
	int a=s.nextInt();
	System.out.print("enter the ending number:");
	int b=s.nextInt();
	System.out.print("the number between a and b is: ");
	for(int i=a;i<=b;i++)
	{System.out.println(i);}
}
}
