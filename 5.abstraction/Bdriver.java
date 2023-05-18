package Abstraction;
abstract class Bank{
	public abstract void m1();
}

class A extends Bank
{public void m1()
  {int  branch_code=123;
   String pwd="Sbi@123";
   String location="Noida";
   System.out.println(branch_code);
	System.out.println(pwd);
	System.out.println(location);
 }
}
public class Bdriver {

	public static void main(String[] args) {
		A a=new A();
		a.m1();
//		System.out.println(a.branch_code);
//		System.out.println(a.pwd);
//		System.out.println(a.location);
	}

}
