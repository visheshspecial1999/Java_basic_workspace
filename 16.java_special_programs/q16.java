package Java_programs;
//16.WAP TO PRINT SUM OF ODD NO B/W 35 TO 11
public class q16 {

	public static void main(String[] args) {
		int a=35;int b=11;int sum=0;
		for(int i=a;i>=b;i--)
		{if(i%2!=0)
		{sum=sum+i;
		}
		}
		System.out.println("the sum of odd number between 35 and 11 is :"+sum);

	}

}
