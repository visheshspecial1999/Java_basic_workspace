package Abstraction;

 interface Account1
{public abstract void m1();
 /*public static void folder_name()
 {System.out.println("current account");
}
 public static void acc_no()
 {System.out.println(536556476);}
 public static void ifsc_code()
 {System.out.println("Del000123");}*/
}
 
 interface ATM1
 {public abstract void m2();
  /*public static void atm_code()
  {System.out.println(990);
 }
  public static void location()
  {System.out.println("Delhi");
  }*/
  }
 class Bank1 implements Account1,ATM1
{ public void m1()
	 {System.out.println("current account");
	  System.out.println(536556476);
	  System.out.println("Del000123");
	  }
  public void m2()
  {System.out.println(990);
   System.out.println("Delhi");
  }
 }
  
public class A3_icici {

	public static void main(String[] args) {
		Bank1 b=new Bank1();
		b.m1();
		b.m2();

	}

}
