package Java_Strings;

public class q135 {

	public static void main(String[] args) {
		String s="java is programming langusge";
		String s1[]=s.split(" ");
		String upper="";
		for(String s2:s1)
		{String first=s2.substring(0,1);
		String afterFirst=s2.substring(1);
		upper=upper+first.toUpperCase()+afterFirst+" ";
		}
		System.out.println(upper);
	}

}
