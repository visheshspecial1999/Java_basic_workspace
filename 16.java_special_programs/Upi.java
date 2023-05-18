package Java_programs;
import java.util.Scanner;
public class Upi 
{
	public static void main(String[] args) 
	 {
		int upipin=1010;
		int balance=100000;
		Scanner sr=new Scanner(System.in);
		System.out.print("enter the ammount to transfer:");
			int amount=sr.nextInt();
			if(amount>0)
			{
				System.out.print("enter your upipin");
				int userpin=sr.nextInt();
					if(userpin==upipin)
						{
							if(amount<=balance)
							 {
								 System.out.println("Transaction succesful "+amount);
								 System.out.print("The remaining balance is: "+(balance-amount));
							 	}
							else {System.out.print("insuffcient balance in your account");}
						}
						else {System.out.print("incorrect upipin please try again:");}
						}
						else {System.out.print("amount can not be zero please enter valid amount");}
			}
	}
		
