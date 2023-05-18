package Java_Array;
//118.wap to sort first half in ascending order and second half in descending order.
public class q118 {

	public static void main(String[] args) {
		int ar[]= {20,23,12,11,40,14};
		for(int i=0;i<ar.length/2;i++)
		{for(int j=0;j<ar.length/2;j++)
		{if(ar[j]>ar[j+1])
		{int temp=ar[j];
		ar[j]=ar[j+1];
		ar[j+1]=temp;
		}
		}
		}
		for(int i=ar.length/2;i<ar.length;i++)
		{for(int j=ar.length/2;j<ar.length-1;j++)
		{if(ar[j]<ar[j+1])
		{int temp=ar[j];
		 ar[j]=ar[j+1];
		 ar[j+1]=temp;
		}
		}
		}
		for(int i=0;i<ar.length;i++)
		{System.out.println(ar[i]);
		}
	}

}
