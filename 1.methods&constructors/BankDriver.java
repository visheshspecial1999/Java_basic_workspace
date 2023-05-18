package basic;

class Bank
{int subbank=3;
}

class ICICI extends Bank
{int interest=8;
public void bankDetails()
{System.out.print(interest);
}
}

class SBI extends ICICI
{int interest=9;
public void bankDetails()
{System.out.print(interest);
}
}

class AXIS extends SBI
{int interest=10;
public void bankDetails()
{System.out.print(interest);
}
}

class BankDriver {

	public static void main(String[] args) {
	AXIS A=new AXIS();
	A.bankDetails();

	}

}
