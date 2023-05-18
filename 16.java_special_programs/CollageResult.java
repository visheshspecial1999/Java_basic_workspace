package Java_programs;
import java.util.Scanner;

public class CollageResult
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println(".........Welcome to AKTU ERP portal..........");
		System.out.println(" Here you can check your collage result status");
		System.out.print("enter the marks of physic:");
		int m1=s.nextInt();
			System.out.print("enter the marks of chemestry:");
		int m2=s.nextInt();
			System.out.print("enter the marks of mathmatis:");
		int m3=s.nextInt();
		if(m1<100&&m2<100&&m3<100)
			{
				if(m1>=35&&m2>=35&&m3>=35)
					{
						int avg=(m1+m2+m3)/3;
							if(avg>=35 && avg<50)
								{System.out.print("pass");}
								else if(avg>=50 && avg<60)
								{System.out.print("second class");}
								else if(avg>=60 && avg<85)
										{System.out.print("first class");}
								else
											{System.out.print("distinction");}
						}
							else {
								if(m1<35&&m2>=35&&m3>=35)
								{	System.out.print("You are fail in physic");}
								else if(m1>35&&m2<=35&&m3>=35)
								{	System.out.print("You are fail in chemestry");}
								else if(m1>35&&m2>=35&&m3<=35)
								{	System.out.print("You are fail in mathmatics");}
								else if(m1<35&&m2<=35&&m3>=35)
								{	System.out.print("You are fail in physic and chemestry");}
								else if(m1>35&&m2<=35&&m3<=35)
								{	System.out.print("You are fail in chemestry and mathmatics");}
								else if(m1<35&&m2>=35&&m3<=35)
								{	System.out.print("You are fail in mathmatics and physic");}
								else
								{	System.out.print("You are fail all the subjects");}
								}
			}
				else	
					{
					if(m1>100&&m2<100&&m3<100)
								{	System.out.print("you have entered invalid marks of physic");}
							else if	(m1<100&&m2>100&&m3<100)
								{	System.out.print("You hava entered invalid marks of chemestry");}
								else if(m1<100&&m2<100&&m3>100)
								{	System.out.print("You have entered invalid marks of mathmatics");}
								else if(m1>100&&m2>100&&m3<100)
								{	System.out.print("You have entered invalid marks of physic and chemestry");}
								else if((m1<100&&m2>100&&m3>100))
								{	System.out.print("You have entered invalid marks of chemestry and mathmatics");}
								else if(m1>100&&m2<100&&m3>100)
								{	System.out.print("You have entered invalid marks of mathmatics and physic");}
								else
								{	System.out.print("You have entered invalid marks of all the subjects");}
					}
	}
}