package Java_programs;
//41.CHECK WHETHER THE NO IS PERFECT NO OR NOT.
import java.util.Scanner;
public class q41 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int a=s.nextInt();
		int sum=0;
		int a1=a;
		for(int i=1;i<a;i++)
		{if(a%i==0)
		{
		sum=sum+i;
		}
		}
		if(sum==a1)
		{System.out.print("perfect number");}
		else
		{System.out.print("not perfect number");}
		 
		
		}

	}