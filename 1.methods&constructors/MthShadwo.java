package basic;
class Parent
	{static int a=10;
	public static void m1()
		{
		 System.out.println(a);	
		}
	}
	class Child extends Parent
	{static int b=20;
	public static void m1()
		{System.out.println(b);
		}
	}
	
	public class MthShadwo {
		public static void main(String [] args)
			{Parent.m1();
			Child.m1();
		  }
		}