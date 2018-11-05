/*
- Underlying dataStructure is HashTable and LinkedList
- Insertion order is preserved.
- It is also generic " class LinkedHashSet<E> ".
- Introduced in 1.4 version.
- Duplicates are not allowed.
- Useful in Cache Memory implementations between Primary memory and Secondary memory.
- Also this implementation of Set is not synchronized. If multiple threads access a treeset concurrently and atleast one 
  of the threads modifies the set, it must be synchronized externally.
  Collections.synchronizedSet(new TreeSet()) can be used for synchronizing it.
- Its a implementation of Set with predictable iteration order.
- This class provides all optional Set operations and permits null elements.
- Like HashSet, it provides constant-time performance for basic operations like add(), contains() and remove()
  assuming that hash function disperses elements properly among the buckets.
- Performance is slightly below HashSet due to added expense of maintaining the linked list.
- One advantage is that iteration over LHS requires time proportional to the size regardless of its capacity.
  Whereas iteration over HS is likely to be more expensive, requiring time proportional to its capacity.
- LHS has two parameters that affect its performance: initial capacity and load factor. They are defined
  precisely as for HashSet.

*/

import java.util.*;

class LHS{
	public static void main(String[] args){
		HashSet hs = new HashSet();
		hs.add("B");
		hs.add("F");
		hs.add(null);
		hs.add("P");
		hs.add("X");
		hs.add(16);
		System.out.println(hs.add("X")); // false
 		System.out.println(hs);
		System.out.println(hs.size());

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("B");
		lhs.add("F");
		lhs.add(null);
		lhs.add("P");
		lhs.add("X");
		lhs.add(16);
		System.out.println(lhs.add("X")); // false
 		System.out.println(lhs);
		System.out.println(lhs.size());
	}
}