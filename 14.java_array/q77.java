package Java_Array;
import java.util.Scanner;//77.CREATE ARRAY TO STORE TEN DECIMAL VALUES AND DISPLAY IT.
public class q77 {
	public static void main(String [] args)
	{
Scanner s=new Scanner(System.in);
System.out.println("enetr ten decimal values :");
int ar[]=new int  [10];
for(int i=0;i<ar.length;i++)
{ar[i]=s.nextInt();
}
for(int i=0;i<ar.length;i++)
{System.out.println(ar[i]);
}
}
}