package Java_programs;

import java.util.Scanner;

//WAP TO CHECK NO IS ARMSTRONG NUMBER.
public class q65 {// Armstrong number btw 1 to 1000: 1-9, 153, 370, 371,407
	  public static void main(String [] args){
	  Scanner s=new Scanner(System.in);
	  System.out.print("enter any number to check: ");
	  int num=s.nextInt();
	  int digit=0;
	  int sum=0;
	  int num1=num;
	  int num2=num;
	  while(num>0) {
		  digit++;
		  num=num/10;
	  }
	  
	  while(num1>0) {
		 int rem=num1%10;
		 int fact=1;
		 int iteration=digit;
		 while(iteration>0) {
			 fact=fact*rem;
			 iteration--;
		 }
//		 System.out.println(fact);
		 num1=num1/10;
		 sum=sum+fact;
	  }
	if(num2==sum) {
		System.out.println(sum+" is a armstrong number");
	}
	else {
		System.out.println(num2+" is not a armstrong number");
	}
	  }
	}
