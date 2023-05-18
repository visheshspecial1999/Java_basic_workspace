package Java_Array;

public class sq08 {

	public static void main(String[] args) {
		String s=new String("Mahesh");
		String s1=new String("Mahesh");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		s.concat("Babu");
		System.out.println(s);
		String s2=s.concat(" Babu");
		System.out.println(s2);

	}

}
