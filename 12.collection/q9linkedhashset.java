package collections;
import java.util.LinkedHashSet;
public class q9linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		l.add("hi");
		l.add("good morning");
		l.add(true);
		l.add(false);
		l.add(0.6535f);
		l.add("hi");
		l.add(true);
		l.add(null);
		l.add(null);
		l.remove("hi");
		System.out.println(l);
	}

}
