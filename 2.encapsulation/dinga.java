		class Type_casting
{
		public static void main(String [] args)
	{	
		int a=6725265;
		byte b= (byte)a;//  Compiler can not convert implicitly higher size of data in lower size of data if the range of higer size of data is greater than the maximum range of lower size of data.
		short s=(short)a;
		long l=a;
		float f=a;
		double d=a;
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}
}	