package Objects;

public class H1 {
	String s1="hi";
	String s2="hello";
	
	public boolean equals(Object o)
	{H1 b2=(H1)o;  
	if(s1.equals(s2))
		return true;
	else
		return false;
	}
	
	public int hashcode()
	{
	 return 123;
	}

	public static void main(String[] args) {
		H1 b=new H1();
		H1 b1=new H1();
		System.out.println(b.equals(b1));
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b1.s1);
		System.out.println(b.hashcode());
		System.out.println(b1.hashcode());

	}

}
