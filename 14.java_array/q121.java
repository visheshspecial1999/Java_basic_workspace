package Java_Array;
//121.wap to show the count of numbers present in the array
import java.util.Scanner;
public class q121 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array size :");
		int a=s.nextInt();
		int ar[]=new int[a];
		System.out.print("enter array elements :");
		int count=0;
		for(int i=0;i<a;i++)
		{ar[i]=s.nextInt();
		count++;}
		System.out.println("the number present in array is :"+count);
	}
}