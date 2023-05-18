package Java_programs;
//41.CHECK WHETHER THE NO IS PERFECT NO OR NOT.
import java.util.Scanner;
public class q42 {// Perfect number  6, 28, 496,8128.

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the nuber 6 or  28 which you want to check :");
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