package Java_Array;
//117. wap to find the biggest consecutive sum in array in array element.
public class q117 {

	public static void main(String[] args) {
		int a[]= {20,30,40,10,12};
		int big=a[0]+a[1];
		for(int i=0;i<a.length-1;i++)
			{if(big<a[i]+a[i+1])
			big=a[i]+a[i+1];
			}
		System.out.print(big);
	}
}