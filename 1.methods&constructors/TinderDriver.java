package basic;
import java.util.Scanner;
class Tinder
{String app_name1;
double version1;
public Tinder(String app_name1, double version1) {
	this.app_name1 = app_name1;
	this.version1 = version1;
}
public void tinder()
{System.out.println("App name :"+app_name1);
System.out.println("version :"+version1);
}
}

class Gpay extends Tinder
{String app_name;
 double version;
public Gpay(String app_name, double version, String app_name1, double version1) {
	super(app_name1, version1);
	this.app_name = app_name;
	this.version = version;
}
public void tinder()
{System.out.println("App name :"+app_name);
System.out.println("version :"+version);
}
}


public class TinderDriver {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("====Tinder Details====");
		System.out.print("enter the app name :");
		String s1=s.next();
		System.out.println("enter the app version :");
		double  s2=s.nextDouble();
		
		System.out.println("====Gpay Details====");
		System.out.print("enter the app name :");
		String s3=s.next();
		System.out.println("enter the app version :");
		double  s4=s.nextDouble();
		Gpay G=new Gpay(s3,s4,s1,s2);
		G.tinder();
	}
}
