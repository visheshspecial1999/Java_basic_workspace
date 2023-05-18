package Java_Strings;
//126.WAP TO COUNT THE CHARACTERS PRESENT IN STRINGWITHOUT USINGLENGTH().
public class q126 {

	public static void main(String[] args) {
		String s="Manmohan Shingh";
		//char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++)
		{if(s.charAt(i)!=' ')
			//if(ch[i]!=' ')
			{count++;
			}
		}
			
		System.out.println(count);
	}
}
