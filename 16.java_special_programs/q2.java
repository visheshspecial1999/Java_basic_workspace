package Java_programs;//2.WAP TO CHECK WHETHER THE PERSON IS ELIGIBLE TO MARRY OR NOT
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("====welcome to marrige registation portal : ");
		System.out.println("please chose your gender according to check eligibilty====");
		System.out.println("for Male press : 1");
		System.out.println("for Female press : 2");
		int i=s.nextInt();
		switch(i)
		{case 1:
		{System.out.print("enter your current age:");
			int n=s.nextInt();
			if(n>=25)
			{System.out.print("congratulation you are eligible to marry:");
			}
			else
			{System.out.print("sorry you are not eligible to marry:");
			}
			break ;
		}
		case 2:
		{System.out.print("enter your current age:");
		int n1=s.nextInt();
		if(n1>=21)
		{System.out.print("congratulation you are eligible to marry:");
		}
		else
		{System.out.print("sorry you are not eligible to marry:");
		}
		break ;
	}
		default :
		{System.out.print("please choose correct option");
		}
	}
}
}