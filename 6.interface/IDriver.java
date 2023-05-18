package Interface;
interface I1
{public abstract void m1();
}
class A2 implements I1
{public void m1()
	{System.out.println("m1");
}
}
public class IDriver {

	public static void main(String[] args) {
		A2 a=new A2();
		a.m1();
		

	}

}
