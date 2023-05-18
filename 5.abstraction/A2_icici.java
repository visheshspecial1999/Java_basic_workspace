package Abstraction;

abstract class Account
{public abstract void m1();
 public static void folder_name()
 {System.out.println("saving account");
 }
 public static void acc_no()
 {System.out.println(123456789);
 }
 public static void ifsc_code()
 {System.out.println("NOIDA000123");
}
}

class ATM extends Account
{	int atm_code;
	String loc;
	ATM(int atm_code,String loc)
	{this.atm_code=atm_code;
	 this.loc=loc;
	}
public void m1()
{System.out.println(atm_code);
 System.out.println(loc);
}
}

public class A2_icici {

	public static void main(String[] args) {
		ATM a=new ATM(990,"india");
		a.m1();
		a.folder_name();
		a.acc_no();
		a.ifsc_code();
	}
}
