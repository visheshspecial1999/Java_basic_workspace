package Java_Strings;
//129.FIND THE DUPLICATE CHARACTER PRESENT IN THE STRING.
public class q129 {

	public static void main(String[] args) {
		String s="MANMOHAN SINGH";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{for(int j=i+1;j<ch.length;j++)
		{if(ch[i]==ch[j])
			System.out.println(ch[i]);
		}
		}
		}
}