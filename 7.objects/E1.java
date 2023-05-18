package Objects;

public class E1 {	
			String s1="hi";
			String s2="hello";
			public boolean equals(Object o)
			{E1 b2=(E1)o;
			if(s1.equals(s2))
				return true;
			else
				return false;
			}
			public static void main(String[] args) {
				E1 b=new E1();
				E1 b1=new E1();
				System.out.println(b.equals(b1));
			}		
		}