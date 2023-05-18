package Java_Array;
//113d.wap to remove the duplicate values from unsorted array without using  temporary  array .
import java.util.Scanner;
public class q113d {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the array size ");
	int size=s.nextInt();
	int ar[]=new int[size];
	System.out.println("enter array elements");
	for(int i=0;i<ar.length;i++)
	{ar[i]=s.nextInt();}
	// for  sorting the array in assending order
	for(int  i=0;i<ar.length;i++)
	{for(int j=i+1;j<ar.length-1;j++)
	{if(ar[j]>ar[j+1])
	{int temp=ar[j];
	ar[j]=ar[j+1];
	ar[j+1]=temp;
	}
	}
	}
	int l=0;
	for(int k=0;k<ar.length-1;k++)
	{if(ar[k]!=ar[k+1])
	{ar[l]=ar[k];
	l=l+1;
	}
	}
	
	ar[l]=ar[ar.length-1];
	
	for(int m=0;m<l+1;m++)
	{System.out.println(ar[m]);
	}
	}
}
