package Java_Array;
import java.util.Scanner;//78.WAP TO STORE RCB PLAYERS NAME IN AN ARRAY AND DISPLAY IT.
public class q78 {
	
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of RBC players :");
		int a=s.nextInt();
		System.out.println("enter RBC players name :");
		
		String ar[]=new String[a];
		for(int i=0;i<ar.length;i++)
		{ar[i]=s.nextLine();
		}
		for(int i=0;i<ar.length;i++)
		{System.out.println(ar[i]+"");
	  }
	}
	}

