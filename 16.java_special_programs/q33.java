package Java_programs;
import java.util.Scanner;//33.WAP TO CALCULATE CUBE OF EVERY DIGIT IF DIGIT IS ODD IN A NUMBER.
public class q33 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter any integer number :");
		int a=s.nextInt();
		int sum=0;
		while(a>0)
		{int re=a%10;
		 sum=sum*10+re;
		 a=a/10; 
		}
		System.out.println("the cube of odd digits is:");
		while(sum>0)
		{int re=sum%10;
			if(re%2!=0)
			{int a1=re*re*re;
			 System.out.println(a1);
			}
			 sum=sum/10;

	}

}
}
