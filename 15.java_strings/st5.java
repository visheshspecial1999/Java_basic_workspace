package Java_Strings;
//desine a methode to come out number of vowels and consonants of given string.
public class st5 {

	public static void main(String[] args) {
		String s1="Laila kumari";
		String s2=s1.toLowerCase();
		char ch[]=s2.toCharArray();
		int ar[]=new int[ch.length];
		for(int i=0;i<ar.length;i++)
		{ar[i]=(int)ch[i];}
		int vowel=0;
		int consonat=0;
		char a =97,e = 101,i = 105,o = 111,u = 117;
		for(int j=0;j<ch.length;j++)
		{
			
		{if(ar[j]==97||ar[j]==101||ar[j]==105||ar[j]==111||ar[j]==117)
			{vowel++;
			}
		else if(ar[j]==32)
		{}
		else
		{consonat++;
		}
		}
		
}
		System.out.println("the number of vowels in string is:"+vowel);
		System.out.println("the number of consonant in string is:"+consonat);
		
}
}

