package Java_programs;//5.WRITE ONE PROGRAM FOR NESTED IF,else if Ladder->IN CLASS
import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("====welcome to mygov login page====");
		System.out.println("please choose login option from menu:");
		System.out.println("login with user name and password press : 1");
		System.out.println("login with email name and password press : 2");
		System.out.println("login with user name  and sequrity key : 3");
		System.out.println("login with user name  and recovery code : 4");
		int i=s.nextInt();
		switch(i)
		{
			case 1:
			{System.out.print("enter your user name:");
			String s1=s.next();
			if(s1=="Admin@7876")
			{System.out.print("enter your password");
			String p1=s.next();
				if(p1=="Jsp@321")
				{System.out.print("login successfuly");}
				else 
				{System.out.println("wrong password please try again");}
			}
			else
			{System.out.println("user name does not exsite please try again");}	
			}
			break ;
			
			case 2:
			{System.out.print("enter your email:");
			String s1=s.next();
			if(s1=="visheshspecial1999@nic.in")
			{System.out.print("enter your password");
			String p1=s.next();
				if(p1=="Nic@321")
				{System.out.print("login successfuly");}
				else 
				{System.out.println("wrong password please try again");}
			}
			else
			{System.out.println("email does not exsite please try again");}
			}
			break ;
			
			case 3:
			{System.out.print("enter your user name:");
			String s1=s.next();
			if(s1=="Admin@7876")
			{System.out.print("insert your sequirty key in usb slot:");
			 System.out.print("enter your sequirty key password:");
			 String p1=s.next();
				if(p1=="mynic@4345")
				{System.out.print("login successfuly");}
				else 
				{System.out.println("wrong sequrity key password please try again");}
			  }
			else
			{System.out.println("invalid user name please try again");}
			}
				break;
			
			case 4:
			{System.out.print("enter your user name:");
			String s1=s.next();
			if(s1=="Admin@7876")
			{System.out.print("enter the recovery code received on your mobile number:");
			String p1=s.next();
				if(p1=="78664785")
				{System.out.print("login successfuly");}
				else 
				{System.out.println("wrong password please try again");}
			}
			else
			{System.out.println("user name does not exsite please try again");}	
			}
		}
	}
}
