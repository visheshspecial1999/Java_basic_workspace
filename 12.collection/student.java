package collections;

public class student {
	String sname;
	int roll;
	String collage;
	public student(String sname, int roll, String collage) {
		super();
		this.sname = sname; 
		this.roll = roll;
		this.collage = collage;
	}
	public void Details()
	{
		System.out.println(sname);
		System.out.println(roll);
		System.out.println(collage);
	}


}
