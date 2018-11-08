/*

TREESET
- It extends AbstractSet and implements NavigableSet interface.
- It creates a collection that uses a tree for storage.
- Objects are stored in sorted, ascending order.
- Access and retrieval times are quite fast, which makes TreeSet an excellent choice when sorting large
  amounts of sorted information that must be found quickly.
- TreeSet is also generic " class TreeSet<E>"
- It has 4 constructors 1) TreeSet()	2) TreeSet(Collection<? extends E> c)
  4) TreeSet(Comparator<? super E> comp)  4) TreeSet(SortedSet<E> ss)
- TS is a NavigableSet implementation which is based on TreeMap and ordering of element is based on Comparable or
  Comparator based on the type of constructor used.
- Provides a guaranted log(n) time cost for add(), remove() and contains().
- Note that ordering maintained by a set must be consistent with equals() if it is to correctly implement Set interface.
- Also this implementation of Set is not synchronized. If multiple threads access a treeset concurrently and atleast one 
  of the threads modifies the set, it must be synchronized externally.
  Collections.synchronizedSortedSet(new TreeSet()) can be used for synchronizing it.

*/

import java.util.*;

class TS{
	public static void main(String args[]){
		TreeSet t = new TreeSet();
		for(int i=0;i<=10;i++){
			t.add(i);
		}
		System.out.println(t);
		System.out.println(t.add(11));
		System.out.println(t);

		TreeSet ts = new TreeSet();
		ts.add("A");
		ts.add("B");
		ts.add("a");
		ts.add("b");
		// ts.add(1);  TreeSet cannot have Heterogeneous elements...
		// ts.add(null); TreeSet can only take null value if empty and if we add anything to it later then throw NPE
						// If the TreeSet is not empty then it will throw NPE due to comparision of null with any element.
		System.out.println(ts);

		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		System.out.println("A".compareTo("A"));


		
	}
}