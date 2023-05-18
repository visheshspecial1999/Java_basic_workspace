package Java_Array;

public class sq15 {
	public static void main(String[] args) {
		String s="Manmohan";
		char ch[]=s.toCharArray();
		String rev="";
		for (int i = 0; i < ch.length; i++) {
			rev=ch[i]+rev;
			
		}
		System.out.print(rev);
	}

}
