package Interface;
import java.util.Scanner;
interface creditcard
{public abstract int rupees(int r);
 public abstract double dollar(double d);
 public abstract double ponds(double p);
}
class BankAccount implements creditcard
{public int rupees(int x)
	{
 return x;}

public double dollar(double y )
{
return y;}
 
public double ponds(double z)
{
return z;}

}
public class I4Driver {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("====Enter credit currency====");
		System.out.println("enter limit in rupees :");
		int x1=s.nextInt();
		System.out.println("enter limit in dollars :");
		double y1=s.nextDouble();
		System.out.println("enter limit in ponds :");
		double z1=s.nextDouble();
		System.out.println("====credit limit====");
		BankAccount b=new BankAccount();
		System.out.println(b.rupees(x1));
		System.out.println(b.dollar(y1));
		System.out.println(b.ponds(z1));
		

	}

}
