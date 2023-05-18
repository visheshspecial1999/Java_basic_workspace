package collection_list;

import java.sql.Array;
import java.util.ArrayList;

public class array1 {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(1);
		ar.add("hi");
		ar.add("apple");
		ar.add("boy");
		ar.add(31342);
		ar.add(null);
		ArrayList ar1=new ArrayList ();
		ar1.add("cat");
		ar.add(4, "dog");
		ar1.addAll(ar);
		System.out.println(ar.contains("hi"));
		System.out.println(ar.contains("mango"));
		System.out.println(ar1.containsAll(ar));
		System.out.println(ar.isEmpty());
		ar1.clear();
		System.out.println(ar);
		System.out.println(ar1.size());
	}
}