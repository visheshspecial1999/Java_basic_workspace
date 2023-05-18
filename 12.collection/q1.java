package collections;
import java.util.ArrayList;
public class q1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10.5);
		a.add('v');
		a.add("hello");
		a.remove(0);
		System.out.println(a.contains(10.6));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a);

	}

}
