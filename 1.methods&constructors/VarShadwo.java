package basic;

public class VarShadwo{
public static void main(String[] args)
{
	B b=new B();
	b.Bdetails();

}
}
class A{
	int a=10;}

class B extends A
{int a=20;
public void Bdetails()
{System.out.println(super.a);
System.out.println(a);
}
}
