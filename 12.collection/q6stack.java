package collections;
import java.util.Stack;
public class q6stack {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.search(20));
		System.out.println(s);

	}

}
