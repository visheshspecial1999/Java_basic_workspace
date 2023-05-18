package Java_programs;
import java.util.Scanner;//30.WAP TO PRINT PALINDROME NUMBER B/W 10 TO 200.
public class q30 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.print("enter the lower limit :");
		int a=sr.nextInt();
		System.out.print("enter the upper limit :");
		int b=sr.nextInt();
		
		for(int i=a;i<=b;i++)
		{	
			int a2=i;
			int sum=0;
			int a1=i;
			while(a2>0)
			{int re=a2%10;
			 sum=sum*10+re;
			 a2=a2/10;}
			if(sum==a1)
			{System.out.println(sum);
			}
		  }
	}

	}