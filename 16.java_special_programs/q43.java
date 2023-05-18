package Java_programs;
//43.WAP TO CALCULATE FACTORIAL OF A NUMBER.
import java.util.Scanner;
public class q43 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter any positive  integer  number :");
		int a=s.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{fact=fact*i;}
		System.out.print("the factorial of entered number is :"+fact);
	}

}
