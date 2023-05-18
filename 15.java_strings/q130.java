package Java_Strings;
//130.WAP TO FIND THE OCCURANCE OF EACH CHARACTER IN A STRING.
public class q130 {

	public static void main(String[] args) {
		String s="MANMOHAN SINGH";
		char ch[]=s.toCharArray();
		int temp[]=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{int count=1;
		{for(int j=i+1;j<ch.length;j++)
		{if(ch[i]==ch[j])
		{count++;
			temp[j]=-1;
		}
		}
		}
		if(temp[i]!=-1)
		{if(ch[i]!=' ')//if(ch[i]!=' '&&count>1)
		{
			System.out.println(ch[i]+" "+count);
		}
		}
	}

}
}