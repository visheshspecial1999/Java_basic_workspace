package Java_programs;
// 63.WAP TO PRINT PRIME NUMBER B/W 1 TO 50.
import java.util.Scanner; 
public class q63 {
	  public static void main(String [] args){
	  Scanner s=new Scanner(System.in);
	  System.out.print("enter lower limit: ");
	  int low=s.nextInt();
	  System.out.print("enter upper limit: ");
	  int upp=s.nextInt();
	  System.out.print("the prime numbers are: ");
	  int total=0;
	  for(int num=low;num<upp;num++) {
		  int num1=num;
		  int count=0;
		  for(int i=1;i<=num;i++) {
			  if(num%i==0) {
				 count++;
			  }
		  }
		  if(count==2) {
			  System.out.print(num1+" ");
			  total++;
		  }
	  }
	  System.out.println();
	  System.out.println("total prime number present btw selected range is: "+total);
	  }
	}
