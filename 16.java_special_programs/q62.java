package Java_programs;
import java.util.Scanner; //62.WAP TO CHECK WHETHER NUMBER IS PRIME NO OR NOT.
public class q62 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any integer number :");
		int a=s.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("it is prime number ");
		}
		else if(a==1)
		{
			System.out.println("it is neighter prime nor composite number");
		}
		else
		{
			System.out.println("it not prime number");
		}

	}

}
