package collections;

import java.util.LinkedList;
import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		student s=new student("Laila",12,"ABC");
		student s1=new student("sheela",32,"CDE");
		l.add(s);
		l.add(s1);
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}