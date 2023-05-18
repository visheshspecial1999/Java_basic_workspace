package Java_Strings;
//desine a method to check a string is palindrome or not.
public class st7 {

	public static void main(String[] args) {
	String s1="dad";
	char ch[]=s1.toCharArray();
	char ch1[]=new char[ch.length];
	for(int i=0;i<ch.length;i++)
	{ch1[i]=ch[ch.length-1];
	} 
	int count=1;
	for(int i=0;i<ch.length;i++)
	{if(ch[i]==ch1[i])
	{count++;
	}
	}
	System.out.println(count);
	if(count==ch1.length)
	{	
	System.out.println("string is palindrome");
	}
	else
	{System.out.println("string is not palindrome");
}
	}
}
