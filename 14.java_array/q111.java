package Java_Array;
//111.WAP TO PRINT THE DUPLICATE ELEMENTS IN AN ARRAY.
public class q111{
	public static void main(String args[]) {
	int ar[]= {20,30,40,20,30,44,20,30,30};
	int temp[]=new int[ar.length];
	for(int i=0;i<ar.length;i++) {
		int count=0;
	for(int j=i+1;j<ar.length;j++)
	{if(ar[i]==ar[j])
	{count++;
	temp[j]=-1;
	}
	}
	
	if(temp[i]!=-1&&count>1)
		{System.out.println(ar[i]+" ");
}
	
	}
		

			}
}


