package Java_programs;
import java.util.Scanner;//55.DESIGN A METHOD TO RETURN FACTORIAL OF EACH DIGIT IN A NUMBER.-
public class q56 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int n=s.nextInt();
		
		System.out.println("the factorial of each digits of given number is :");
		m1(n);
	}
public static void m1(int x)
{int fact2=0;
	int sum=0;
 while(x>0)
 {
	 int rem=x%10;
	 sum=sum*10+rem;
	 x=x/10;
 }
 int sum3=0;
while(sum>0)
{int fact=1;
	int rem=sum%10;
for(int i=1;i<=rem;i++)
{fact=fact*i;}
fact2=fact;
sum=sum/10;
System.out.println(fact2);
sum3=sum3+fact2;
}
System.out.println("the sum of factorial of all digits is :"+sum3);
}
}
