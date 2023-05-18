package Java_programs;
//54.DESIGN A METHOD TO CALCULATE SUM OF EVEN DIGITS AND RETURN, INSIDE MAIN METHOD 
//CALCULATE SQUARE OF RETURNING RESULT.
	import java.util.Scanner;
	public class q54{

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("enter any integer number :");
			int n=s.nextInt();
			int b=m1(n);
			System.out.println("the sum of even digits of given number is :"+ b);

		}
		public static int m1(int x)
		{int sum=0;
		
		 while(x>0)
		 {int rem=x%10;
		 {if(rem%2==0)
		  sum=sum+rem;
		  x=x/10;
		 }
		 
		}
		return sum;
	}
}