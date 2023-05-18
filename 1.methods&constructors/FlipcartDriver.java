package basic;
class Flipcart
{String product_name="laptop";
 int price=40000;
 void details()
 {System.out.println("Product_Name= "+product_name+" price :"+price);}
}

class Amazon extends Flipcart
{String product_name="laptop";
 int price=30000;
 void details()
 {System.out.println("Product_Name= "+product_name+" price :"+price);}
}


class Myntra extends Flipcart
{String product_name="laptop";
 int price=25000;
 void details()
 {System.out.println("Product_Name= "+product_name+" price :"+price);}
}
public class FlipcartDriver {

	public static void main(String[] args) {
		Amazon A=new Amazon();
		A.details();
		Myntra M=new Myntra();
		M.details();

	}

}
