package Java_Array;

public class sq06 {
int rollNo;
String name;
sq06(int rollNo,String name)
{this.rollNo=rollNo;
this.name=name;
}
public  String toString()
{return rollNo+" "+name;
}

	public static void main(String[] args) {
		sq06 s=new sq06(101,"Mahesh");
		System.out.println(s);
		System.out.println(s.toString());

	}

}
