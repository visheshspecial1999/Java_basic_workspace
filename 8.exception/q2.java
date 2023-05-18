package Exception;

public class q2 {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
			int a=5/0;
			System.out.println(a);
			int b=5+3;
			System.out.println(b);
			
			}
			catch(ArithmeticException  a) {
				System.out.println("ArithmeticException solved");	
				int b=5+2;
				System.out.println(b);
			}
			catch(NullPointerException n)
		{
				System.out.println("NullPointerException solved");
				int b=5+3;
				System.out.println(b);
		}
		
	}
}
