import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

class St{
	public static void main(String [] args){
		Stack s = new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(null);
		System.out.println(s);

		Deque<Integer> d = new ArrayDeque<>();
		d.add(null);
		System.out.println(d);
	}
}