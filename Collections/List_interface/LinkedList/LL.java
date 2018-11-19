/*

LINKEDLIST
- It extends AbstractSquentialList and implements List, Deque, Cloneable, Serializable and Queue interfaces.
- It has link between each elements and are not stored concurrently in memory as ArrayList.
- Its a generic " class LinkedList<E> " and has two Constructor (1) LinkedList() builds empty linkedlist 
  (2) LinkedList(Collection <? extends E> c) bulids linkedlist with specified collection c elements.
- As it implements Deque, it has access to the methods defined by Deque like addFirst() or offerFirst() to add elements to the start,
  addLast() or offerLast() to add element to the last, getFirst() or peekFirst() to get first element, getLast() or peekLast() to get
  last element, removeFirst() or pollFirst() , removeLast() or pollLast() to remove elements.
- As it implements List interface, add(e) will append items to the end of the list as if we called addLast(). In order to insert item
  to specific index use add(index,e) form of add().
- Its a doubly-linkedlist implementations of List.
- Its not synchronized like ArrayList and needs to be done externally if needed using Collections.synchronizedList(new LinkedList())
- Similarly no modification after iterator is created, else it will throw ConcurrentModificationException. In order to modify a LL 
  by using add() and set() method of ListIterator. It also have previous(), hasPrevious(), next(), hasNext() to iterator in both way.
- Use LinkedList when insertion and deletion operation in the middle of the list needs to be done. Traversal is slower.
- It does not implements RandomAccess and hence is slower when traversed through the collection.
- Positional access requires linear-time in a LinkedList

*/

import java.util.LinkedList;
import java.util.List;
import java.util.Deque;

public class LL 
{
  public static void main(String[] args) 
  {
	List<String> names = new LinkedList<>();
	names.add("Vaishnavi");
	names.add("Aisha");
	names.add("Pranav");
    // names.add(2011);
			
	System.out.println("LinkedList content: " + names);
	System.out.println("LinkedList size: " + names.size());

	Deque<Integer> d = new LinkedList<>();
	d.add(1);
	d.addFirst(1);
	d.addFirst(0);
	d.add(2);
	d.add(null);
	d.addLast(5);
	d.addLast(8);

	System.out.println("LinkedList content: " + d);
	System.out.println("LinkedList size: " + d.size());
	d.removeFirst();
	d.removeLast();
	
	System.out.println("LinkedList content: " + d);
	System.out.println("LinkedList size: " + d.size());
  }
}
