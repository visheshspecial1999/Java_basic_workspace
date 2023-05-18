package Java_Array;
//115.wap to find missing element in an array.
public class q115 {

	public static void main(String[] args) {
		int ar[]= {20,25,30,33};
		for(int i=0;i<ar.length-1;i++)
		{for(int j=ar[i]+1;j<ar[i+1];j++)
		{System.out.println(j);
		}
	}
  }
}