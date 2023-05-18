package Java_Strings;
//127.WAP TO CONVERT UPPERCASE TO LOWER CASE WITHOUT USING INBUILT METHOD.
public class q127 {

	public static void main(String[] args) {
		String s="MANMOHAN SHINGH";
		char ch[]=s.toCharArray();
		String small="";
		for(int i=0;i<ch.length;i++)
		{ if(ch[i]!=' ')
			
			{char c=(char)(ch[i]+32);
			  small=small+c;
			}
		else {
			char c=(char)(32);
			small=small+c;
		}
		}
		System.out.println(small);
			
			}
	}