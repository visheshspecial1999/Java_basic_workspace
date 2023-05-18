package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class q4 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(true);
		l1.add(false);
		l1.add(true);
		l1.add(false);
		ArrayList a= new ArrayList();
		a.add(10);
		a.addAll(l1);
		a.add("hi");
		
		ListIterator i=a.listIterator();
		while(i.hasNext())
		{System.out.println(i.next());
		
		}
	}
}
