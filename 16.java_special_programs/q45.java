package Java_programs;
import java.util.Scanner;
public class q45 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//45.WAP TO CALCULATE FACTORIAL IF THE DIGIT IS ODD IN A NUMBER.
		System.out.print("enter any positive integer number :");
		int a=s.nextInt();
		if(a>0)
		{
		while(a>0)
			
		{int rem=a%10;
		int fact=1;
		if(rem%2!=0)
		{for(int i=1;i<=rem;i++)
		{
		fact=fact*i;
			
		}
		System.out.println(fact);
		}
		a=a/10;
		}
	}
		else
		{System.out.print("invalid enterger number");
		}
		}
	}