package Java_Strings;

public class st8 {

	public static void main(String[] args) {
		String s1="Good morning every one   ";
		String s3="good morning every one   ";
		String s2="welcome to jspide";
		String s4="good morning";
		System.out.println(s1.concat(s2));
		System.out.println(s1.trim());
		System.out.println(s1.concat(s2));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 10));
		System.out.println(s1.equals(s2));
		System.out.println(s3.equalsIgnoreCase(s1));
		System.out.println(s3.contains(s4));
		System.out.println(s1.split(" "));
		

	}

}
