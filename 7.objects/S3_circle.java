package Objects;

public class S3_circle {int r=10;
	@Override
	public String toString()
	{return r+" ";}
	public static void main(String[] args) {
		S3_circle d=new S3_circle();
		System.out.println(d.toString());
	}
}