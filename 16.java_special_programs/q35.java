package Java_programs;
import java.util.Scanner;//35.CALCULATE SUM OF CUBE OF EACH DIGIT IF DIGIT IS ODD.
public class q35 {

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
		System.out.println("the sum  of cubes of digits is:");
		int sum2=0;
		int a1=0;
		while(sum>0)
		{int re=sum%10;
			if(re%2!=0)
			{a1=re*re*re;
			 sum2=sum2+a1;
			}
			 sum=sum/10;
	}
		System.out.println(sum2);

	}

}
