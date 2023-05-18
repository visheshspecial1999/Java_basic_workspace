package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class q3 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("good morning");
		a.add("good evening");
		a.add("good morning");
		a.add("good evening");
		ListIterator i= a.listIterator();
		while(i.hasNext())
		{System.out.println(i.next());
		
		}

	}

}
