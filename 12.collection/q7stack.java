package collections;
import java.util.Stack;
import java.util.Iterator;
public class q7stack {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push('c');
		s.push(10.5);
		s.push(200);
		s.push(true);
		s.push(0.6567f);
		s.push("x");
		s.pop();
		System.out.println(s.search(true));
		System.out.println(s.peek());
		Iterator i=s.iterator();
		while(i.hasNext())
		{System.out.println(i.next());
		
		}

	}

}
