package Java_Array;
//113a.wap to remove the duplicate values from sorted array by temp array.
public class q113a {
	public static void main(String[] args) {
	int ar[]= {10,20,20,30,30,40,40,40,50,60};
	int temp[]=new int[ar.length];
	int  j=0;
	for(int i=0;i<ar.length-1;i++)
	{if(ar[i]!=ar[i+1])
	{temp[j]=ar[i];
	 j=j+1;
	}
}
	temp[j]=ar[ar.length-1];
	for(int k=0;k<j+1;k++)
	{System.out.print(temp[k]+" ");
	}
	}	
}

