package Java_Strings;
//133.WAP TO REVERSE THE WORD IN A STRING.
public class q133 {

	public static void main(String[] args) {
	String s="java is a programing language";
	char ch[]=s.toCharArray();
	String out="";
	for(int i=0;i<ch.length;i++)
	{String temp="";
	while(i<ch.length &&ch[i]!=' ')
	{temp=ch[i]+temp;
	i++;
	}
	out=out+temp+" ";
	}
	System.out.println(out);
	}

}
