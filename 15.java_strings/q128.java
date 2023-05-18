package Java_Strings;
//128.WAP TO CONVERT LOWER TO UPPERCASE WITHOUT USING INBUILT METHOD.
import java.util.Scanner;
public class q128 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("entet any string in lower case");
	String  st1=s.next();
			st1+=s.nextLine();
	byte[] b1=st1.getBytes();
	for(int i=0;i<b1.length;i++)
	{if(b1[i]==32)
	{
		System.out.print(" ");
	}
	else {
		char c=(char) (b1[i]-32);
		System.out.print(c);
	}

	}
	}

}
