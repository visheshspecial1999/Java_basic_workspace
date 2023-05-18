package Java_programs;

import java.util.Scanner;

//60.WAP TO PRINT SPECIAL NO B/W 10 AND 100.
public class q60 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter lower limit: ");
		int lower = s.nextInt();
		System.out.println("enter upper limit: ");
		int upper = s.nextInt();
		System.out.print("strong numbers are: ");
		for (int num = lower; num < upper; num++) {
			int num1 = num;
			int num2 = num;
			int sum = 0;
			int find=0;
			while (num2 > 0) {
				int rem = num2 % 10;
				int fact = 1;
				for (int i = 1; i <= rem; i++) {
					fact = fact * i;
				}
				sum = sum + fact;
				num2 = num2 / 10;
			}
			if (sum == num1) {
				find++;
				System.out.print(sum + " ");
			}
			if(find==0) {
				System.out.println("no special number present btw the selected range");
			}
		}
	}
}
