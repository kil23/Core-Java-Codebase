/*

STACK
- It extends Vector and implements Serializable, Cloneable, Iterable<E>, Collection<E>, List<E> and RandomAccess marker interface.
- The Stack<E> class represents Last-In-First-Out(LIFO) stack of objects.
- E push(E item) and  synchronized E pop() is provided for Vector to work as stack.
- synchronized E peek() is used to get access to top element of stack.
- boolean empty() is used to check whether the stack is empty.
- synchronized int search(Object o) is used to find item in the stack and discover how far it is from the top.
- It has one Constructor Stack() which creates an empty stack.

*/

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