package collections;
import java.util.HashSet;
public class q8hashset {

	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add('a');
		s.add('b');
		s.add('c');
		s.add(10);
		s.add(null);
		s.add(10);
		s.add(null);
		System.out.println(s);

	}

}
