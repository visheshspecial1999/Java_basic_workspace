package Java_programs;
//15.WAP TO PRINT SUM OF EVEN NO B/W 20 TO 10.
public class q15 {

	public static void main(String[] args) {
		int a=20;int b=10;int sum=0;
		for(int i=a;i>=b;i--)
		{if(i%2==0)
		{sum=sum+i;
		}
		}
		System.out.println("the sum of even number between 20 and 10 is :"+sum);
	}

}
