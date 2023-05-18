package Java_Array;
import java.util.Scanner;
public class sq13 {

	public static void main(String[] args) {
		System.out.print("enter any string :");
		Scanner sr=new Scanner(System.in);
		String s=sr.next();
		char ch[]=s.toCharArray();
		String rev="";
		for(int i=0;i<ch.length;i++)
		{rev=ch[i]+rev;
	}
		if(rev.equals(s))
		{System.out.println("palindrome string");}
		else 
		{System.out.println("not palindrome string");}
	}
}