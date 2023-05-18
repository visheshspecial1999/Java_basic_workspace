package Java_Strings;
//desine a method to display how many characters in each word.
public class st6 {

	public static void main(String[] args) {
		String s1="how are you ";
		String s2=s1.toLowerCase();
		byte b1[]=s2.getBytes();
		int num=0;
		for(int i=0;i<b1.length;i++)
		{
			if(b1[i]!=32)
			{num++;
			}
			else
			{
				System.out.println(num);
				num=0;
		}
		
	}

}
}
