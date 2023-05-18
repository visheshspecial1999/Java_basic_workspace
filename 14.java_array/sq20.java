package Java_Array;

public class sq20 {

	public static void main(String[] args) {
		String s[]= {"Bardman","Zambia","Andaman"};
		for(int i=0;i<s.length;i++)
		{for(int j=0;j<s.length-1;j++) {
			if(s[j].compareTo(s[j+1])>0)
			{String temp=s[j];
			s[j]=s[j+1];
			s[j+1]=temp;
			}
		}
			
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}

	}

}
