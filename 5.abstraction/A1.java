package Abstraction;
abstract class A2{
	public abstract void password();
}
class B extends A2
{public void password()
	{System.out.println("password is :"+123);
}
}
public class A1 {

	public static void main(String[] args) {
		B b=new B();
		b.password();
	}
}