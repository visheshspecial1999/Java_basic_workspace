package Java_Strings;
//131.WAP TO REVERSE THE STRING.
import java.util.Scanner;
public class q131 {
	public static void main(String[] args)
	{Scanner s=new Scanner(System.in);
	 System.out.println("enter any string");
	 String st1=s.nextLine();
	 char ch[]=st1.toCharArray();
	 for(int i=1;i<=ch.length;i++)
		 System.out.print(ch[ch.length-i]);	
	}

}
