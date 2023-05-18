package Interface;
interface C
{public abstract void m1();}
interface D
{public abstract void m2();}

class A3 implements C,D
{public void m1()
	{System.out.println("m1");
	}
public void m2()
{System.out.println( "m2");
}
}
	
public class I3Driver {
	public static void main(String[] args) {
		A3 a=new A3();
		a.m1();
		a.m2();

	}

}
