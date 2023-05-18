package Java_Array;
//110.WAP TO DESIGN A METHOD TO SORT ARRAY ELEMENTS IN DESCENDING ORDER.AND RETURN 
//SORTED ARRAY.
import java.util.Scanner;

public class q110 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("enter size of array :");
		int a=s.nextInt();
		int ar[]=new int[a];
		System.out.print("enter array element :");
		for(int k=0;k<ar.length;k++)
		{ar[k]=s.nextInt();}
		int a1[]=sortArray(ar);
		for(int l=0;l<a1.length;l++)
		{
		System.out.print(a1[l]+" ");
		}

	}
	static int[] sortArray(int ar[])
	{
		for(int j=0;j<ar.length;j++)
		 {for(int i=0;i<ar.length-1;i++)
		 {if(ar[i]<ar[i+1])
		 {
		 	int temp=ar[i];
		 	ar[i]=ar[i+1];
		 	ar[i+1]=temp;
					}
				}
			}
		return ar;
	}

}
