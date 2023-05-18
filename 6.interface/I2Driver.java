package Interface;
interface phonepay
{public abstract void pin();
public abstract void version();
}
 class child implements phonepay
{ public void pin()
	{System.out.println(1234);
	}
  public void version()
  {System.out.println("V2.0325");
}
}
public class I2Driver {

	public static void main(String[] args) {
		child c=new child();
		c.pin();
		c.version();
	}
}
