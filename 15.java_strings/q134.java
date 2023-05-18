package Java_Strings;

public class q134 {
		public static void main(String[] args) {
			String s="java is a programing language";
			String s1[]=s.split(" ");
			for(String s2:s1)
			{char ch[]=s2.toCharArray();
			String rev="";
			for(int i=ch.length-1;i>0;i--)
			{rev=rev+ch[i];
			}
			System.out.print(rev);
	}
}
}