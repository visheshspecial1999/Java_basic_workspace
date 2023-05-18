package Java_Array;
//116.wap to calculate consecutive sum (first two and next two element sum) of the array element.
public class q116 {

	public static void main(String[] args) {
		int a[	]= {20,30,40,10,12};
		for(int i=0;i<a.length-1;i++)
			{int sum=a[i]+a[i+1];
			System.out.print(sum+" ");
			}
	}
}