package Java_programs;

import java.util.Scanner;//55.DESIGN A METHOD TO RETURN FACTORIAL OF EACH DIGIT IN A NUMBER.-

public class q55 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter any integer number: ");
		int num = s.nextInt();
		int num2 = 0;
		int count = 0;
		while (num > 0) {
			count++;
			int rem = num % 10;
			num2 = num2 * 10 + rem;
			num = num / 10;
		}
		int num1 = num2;
		int size = count;
		int ar1[] = factorial(num1, size);
		int sum = 0;
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
			sum = sum + ar1[i];
		}
		System.out.println();
		System.out.println(sum + " " + sum * sum);
	}

	public static int[] factorial(int x, int y) {
		int ar[] = new int[y];
		int index = -1;
		while (x > 0) {
			int rem = x % 10;
			int fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			index++;
			ar[index] = fact;
			x = x / 10;
		}
		return ar;
	}
}