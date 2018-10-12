/*
- Underlying dataStructure is HashTable and LinkedList
- Insertion order is preserved.
- Introduced in 1.4 version.
- Duplicates are not allowed.
- Useful in Cache Memory implementations between Primary memory and Secondary memory.
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