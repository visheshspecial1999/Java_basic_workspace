package collections;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
public class q5 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		LinkedList l1=new LinkedList();
		l1.add(20);
		l1.addAll(l);
		l1.add("hi");
		l1.add(true);
		l1.remove(2);
		ArrayList ar=new ArrayList();
		ar.add("good morning");
		ar.add(false);
		ar.add(l);
		ar.addAll(l1);
		System.out.println(l);
		System.out.println(l1);
		ListIterator i=l1.listIterator();
		while(i.hasNext())
		{System.out.println(i.next()+" ");
		}
		Iterator i1=ar.iterator();
		while(i1.hasNext())
		{System.out.print(i1.next()+" ");
		
		}
		

	}

}
