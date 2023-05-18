package Java_Array;

import java.util.Scanner;

public class sq05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array element :");
		int ar[][]=new int[2][3];
		for(int i=0;i<ar.length;i++)
		{
		{for(int j=0;j<ar[i].length;j++)
			ar[i][j]=s.nextInt();
		}

		}
	
	for(int i=0;i<ar.length;i++)
		{for(int j=0;j<ar[i].length;j++)
		{System.out.print(ar[i][j]+" ");
		}
		}
}
}
