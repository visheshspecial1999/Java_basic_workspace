package Interface;
import java.util.Scanner;
interface creditcard1
{public abstract int rupees(int r);
 public abstract double dollar(double d);
 public abstract double ponds(double p);
}

class BankAccount1 implements creditcard1
{public int rupees(int x)
	{
 return x;}

public double dollar(double y )
{ double dl=y/82.22;
return dl;}
 
public double ponds(double z)
{z=z/91.10;
return z;}

}
public class I5Driver {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("====Enter Indian currency====");
		System.out.println("enter limit in rupees :");
		int x1=s.nextInt();
		System.out.println("====credit limit====");
		BankAccount b=new BankAccount();
		double dl1=b.dollar(x1);
		System.out.println(b.rupees(x1));
		System.out.println(dl1);
		System.out.println(b.ponds(x1));
		

	}

}