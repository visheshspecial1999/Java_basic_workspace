package Java_Array;
import java.util.Scanner;//100.WAP TO DELETE AN ELEMENT AN ELEMENT IN THE SPECIFIED INDEX, THE INDEX VALUE=3.
public class q100 {
	public static void main(String [] args)
	{Scanner s=new Scanner(System.in);
	 System.out.print("enter array size :");
	 int a=s.nextInt();
	 System.out.print("enter order number from which you want to delet the element :");
	 int b=s.nextInt();
	 System.out.print("enter  array elements :");
	 int ar[]=new int[a];// datatype variable[]=new datatype[size];
	 int ar1[]=new int[a-1];
	 for(int i=0;i<a;i++)
	 {ar[i]=s.nextInt();}
	 for(int i=0;i<ar1.length;i++)
	 {	
		 if(i<b-1)
		 {ar1[i]=ar[i];
		 }
		 else
		 {ar1[i]=ar[i+1];
		 }
		 System.out.print(ar1[i]);
	}
}
}