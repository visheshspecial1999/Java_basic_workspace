package Java_programs;
import java.util.Scanner;//19.WAP TO PRINT ODD DIGITS IN A NUMBER.
public class q19 {

	public static void main(String[] args) {
		System.out.print("enter any integer number :");
		Scanner sr=new Scanner(System.in);
			int a=sr.nextInt();
			int sum=0;
			while(a>0)
			{int re=a%10;
			sum=sum*10+re;
			a=a/10;
			}
			System.out.println("the odd digits of number is:");
			while(sum>0)
			{int re1=sum%10;
				if(re1%2!=0)
				{System.out.println(re1);}	
				sum=sum/10;
			}
	}

}
