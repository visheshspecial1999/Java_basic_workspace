package Java_Array;
// two dimensional array
public class sq03 {

	public static void main(String[] args) {
		int ar[][]= {{20,30},{40,50}};
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{for(int j=0;j<ar.length;j++)
		{sum=sum+ar[i][j];
		}
		}
		System.out.println(sum);
	}

}
