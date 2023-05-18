package Exception;

public class q1 {

	public static void main(String[] args) {
		try {
		int a=5/0;
		System.out.println(a);
		}
		catch(ArithmeticException  a) {
			System.out.println("Exception solved");	
		}
	}

}
