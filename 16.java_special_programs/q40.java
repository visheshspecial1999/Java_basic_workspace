package Java_programs;
import  java.util.Scanner;/*40.WAP TO CALCULATE SUM OF ALL THE NOS WHICH IS PRESENT IN 20 TO 60 AND NO SHOULD BE 
DIVISIBLE BY ONLY 11.*/
public class q40 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter starting number :");
		int a=s.nextInt();
		System.out.print("enter ending number :");
		int b=s.nextInt();
		System.out.println("the number devisible by 11 are :");
		for(int i=a;i<=b;i++)
		{if(i%11==0)
		{System.out.println(i);}
		}
	}

}
