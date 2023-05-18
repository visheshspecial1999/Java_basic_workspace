package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class q2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(2);
		a.add(24);
		a.add(1234);
		a.add(12345678);
		a.add(87654321.45);
		a.add(1234.34f);
		a.add('c');
		a.add(true);
//		System.out.println(a.add(9));
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
