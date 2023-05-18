package Java_Strings;
import java.util.Scanner;
//132.WAP TO CHECK WHETHER STRING IS PALINDROME OR NOT.
public class q132 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any string");
	String st1=s.nextLine();
	char ch[]=st1.toCharArray();
	int count=0;
	for(int i=0;i<ch.length;i++)
	{if(ch[i]==ch[ch.length-i-1])
	count++;		
	}
	if(count==ch.length)
	{
		System.out.println("string is palindrome");
	}
	else
	{
		System.out.println("string is not palindrome");
	}
	}

}
