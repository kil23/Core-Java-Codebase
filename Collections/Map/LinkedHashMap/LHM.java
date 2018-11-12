/*

LinkedHashMap:

- It is similar to HashMap and with predictable iteration insertion order.
- It implements Map interface and extends HashMap.
- Its different than HM in the sense that it maintains a doubly-linked list running through all the entries.
	This linked list defines the iteration order(insertion).
- Insertion oder is not affected if a key is re-inserted into the map.
- It has special constructor LinkedHashMap(int capacity, float fillRatio, boolean Order) which creates a LHM
  whose order of Iteration is the order in which its entries were last accessed i.e least-recently accessed
	to most-recently accessed order.
	*This type of map is useful to build LRU caches.*
	If Order is true then last-access-order is maintained else false for insertion-order.
- Operations on collection-views do not affect the order of iteration of backing map.
- removeEldestEntry(Map.Entry m) returns true if it removes the stale mapping from the map.
- It permits null elements.
- O(1) --> add(), contains(), remove() assuming that hash() disperses elements properly across.
- Performance is slightly below HM due to added functionality of maintaining the linked list.
- Iteration over Collection-views of LHM requires time-proportional to size where as HM takes capacity time.
- This Implementation os not synchronized and needs to be externally synchronized.
	Collections.synchronizedMap(new LinkedHashMap(...));
- Iterator is fail-fast. Will throw ConcurrentModificationException if map is modified after iterator is
  created. If iterator remove() is used then no exception is thrown.
	
*/

import java.util.*;

class LHM{
	public static void main(String[] args){
		LinkedHashMap<String, Integer> l = new LinkedHashMap<>();
		l.put("Hi", 2);
		l.put("Hey",3);
		l.put("Hello",5);

		System.out.println("Size of map is "+l.size());

		print(l);

		for(String key : l.keySet()){
			System.out.println(key);
		}

		print(l);
}

	public static void print(Map<String, Integer> m){
		if(m.isEmpty()){
			System.out.println("Map is Empty...");
		}
		else{
			System.out.println("Map is "+m);
		}
	}
}
