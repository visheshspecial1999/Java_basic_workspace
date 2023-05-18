package Java_programs;

import java.util.Scanner;

//47.WAP TO CALCULATE SUM OF FACTORIAL OF ODD DIGIT IN A NUMBER.
public class q48 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter any positive integer number :");
		int a=s.nextInt();
		if(a>0)
		{
			int sum=0;
		while(a>0)
			
		{int rem=a%10;
		int fact=1;int fact1=0;
		if(rem%2!=0)
			
		{for(int i=1;i<=rem;i++)
		{
		fact=fact*i;
			
		}
		   fact1=fact;
		}
		a=a/10;
		sum=sum+fact1;
		}
		System.out.print("the factorial sum of odd digits of number is :"+sum);
		
	}
		else
		{System.out.print("invalid interger number");
		}
		}
	}