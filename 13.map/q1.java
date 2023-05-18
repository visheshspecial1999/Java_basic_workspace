package map;
import java.util.HashMap;
public class q1 {
	public static void main(String[] args) {
	 	HashMap m=new HashMap();
	 	m.put(1,'a');
	 	m.put(2, "hi");
	 	m.put(3,123456788);
	 	m.put(4.2, 0.345267f);
	 	System.out.println(m);
	 	m.remove(1);
	 	System.out.println(m.get(1));
	}
}