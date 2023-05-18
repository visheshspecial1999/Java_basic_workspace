package wrapper;
import java.util.Scanner;
class Facebook{
		private String uname1;
		private String pwd;
		private String uid1;
	 Facebook(String s1, String s2, String s3) {

		this.uname1=s1;
		 this.pwd=s2;
		 this.uid1=s3;
		}
	public String getuname()
		{return uname1;}
	public void setuname(String uname)
		{this.uname1=uname;}
	public void setpwd(String pwd)
		{this.pwd=pwd;}
	public String getuid()
		{return uid1;}
	public void setuid(String uid)
		{this.uid1=uid;}
	}
class FacebookDriver
	{public static void main(String [] args)
{
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the user name :");
	 String s1=s.next();
	 System.out.println("enter the password :");
	 String s2=s.next();
	 System.out.println("enter the user id :");
	 String s3=s.next();
	 Facebook f=new Facebook(s1,s2,s3);
	 System.out.println("your user name is :"+f.getuname());
	 System.out.println("your user id is :"+f.getuid());
	 System.out.println("enter your new user name:");
	 String s4=s.next();
	 f.setuname(s4);
	 System.out.println("enter your new password :");
	 String s5=s.next();
	 f.setpwd(s5);
	 System.out.println("enter your new user id :");
	 String s6=s.next();
	 f.setuid(s6);
	 System.out.println("your updated user name is :"+f.getuname()+"and user id is:"+f.getuid());
	}
}
	 
	 
	 
	
		