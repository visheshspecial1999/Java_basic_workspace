package Java_programs;
import java.util.Scanner;//57.WAP TO CHECK NUMBER IS STRONG NUMBER OR NOT.
public class q57 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter any enteger number :");
		int a=s.nextInt();
		int a1=a;
		int sum=0;
		while(a>0)
			{int  rem=a%10;
			int fact=1 ;
		  
			for(int i=1;i<=rem;i++)
			{fact=fact*i;}
			a=a/10;
		sum=sum+fact;
		}
		if(a1==sum)
		{System.out.println("Strong number");
		}
		else
			{System.out.println("Not strong number");}
	
	}

}
