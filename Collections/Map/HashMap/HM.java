/*
HASHMAP:
- HashTable based implementation of Map interface which provides all the optional map implementations.
- HashMap differs from HashTable in the sense that it is unsynchronized and permits nulls(key can also be null which will
  be placed at  the 0-th bucket in the array).
- MAP doesnot implements Iterable interface. This means that you cannot cycle through a map using forEach style for loop.
  You can't obtain an iterator to map. But we can obtain collection-view of map, which does allow use of for-loop or iterator.
- Map.Entry --> Describes an element(K/V) in a map.This is inner class of Map.
- Maps are not themselves, collections becoz they dont implement Collection interface but you can obtain Collection-view of map.
- entrySet() --> returns a Set that contains the elements in the map.
  keySet() --> obtain a collection-view of keys
	values() --> obtain a collection-view of values.
	Changes to anyone view will affect others.
- It doesnot guarantees the order of the map will remain constant over time.
- HM contains only unique elements and if we assigne same key and different value then old value will be replaced by new value
  and old value will be returned.
- HM extends AbstractMap<K,V> and implements Map<K,V>, Clonable, Serializable.
- HM provides O(1) --> get() and put() operations assuming that hash function has disperses elements properly among the buckets.
- Iteration over collection views requires time proportional to capacity c plus its size s. Thus its important not to set initial
  capacity too high if iteration performance is important.
- HM is affected by- *Initial capacity* (It is the number of buckets(capacity) at the time of creation)
										 *Load factor* 			(Its the measure of how full the HashTable is allowed to get before
										 						 			   the capacity is automatically increased.)
	When the number of entries in the HashTable exceeds the product of the load factor and the current capacity, the HashTable
	is rehashed i.e. internal data structures are rebuilt, so that HashTable has approximately twice the number of buckets.
- Default load factor is 0.75 which offers good tradeoff between time and space costs.
  Default initial capacity is 16.
- If we have bad hash function and all elements are assigned to one bucket only then if may take O(n) time to traverse.
  So in order to avoid this, they are converted into trees which have O(log n) time now.
	It uses Red-Black tree data structure internally and the map will be converted to tree if it crosses threshold value
	i.e static field int TREEIFY_THRESHOLD = 8;
- Expected number of entries in the map and its load factor should be taken into account when setting its inital capacity,
  so as to minimize the number of rehash operations.
- If Initial_capacity > (max_entries/load_factor), no rehashing required.
- This implementation is not synchronized and can be done using Collections.synchronizedMap(new HashMap()).
- Iterator is fail fast and  will throw ConcurrentModificationException if the map is structurally modified at any
  time after creation of iterator.
- Hashmap uses a array of nodes and Node will represent a class having fields - int Hash, K key,V value, Node next
  HashMap contains an array of nodes of these fields.
- Whenever we give any key, first the HashMap uses Object.hashCode() <-- (native method) for calculating the hashCode of that key.
  Now the hash() inside HashMap class will calculate the hash value(index in array or bucket number by taking hashCode() value).
- It has 4 Constructors: 1) HashMap() which creates empty HM with default initial capacity of 16 and default load factor of 0.75
												 2) HashMap(int initialCapacity) creates empty HM with specified initial capacity and default load of 0.75
												 3) HashMap(int initialCapacity, float loadFactor) empty HashMap with specified values.
												 4) HashMap(Map<? extends K, ? extends V> m) creates new HM with same mappings as the specified Map.
- It is unordered and unsorted Map. hashCode() method needs to be overridden. It allows one null key and multiple null values.
- HashTable doesnot allow anu null values.
*/

import java.util.*;

class HM {

	public static void main(String args[]){

		HashMap<String, Integer>h = new HashMap<>();
		h.put("Hey", 10);  // first key-value pair is inserted here using put(key, value)
		h.put("Hi", 20);
		h.put("Hello", 30);
		h.put("HelloWorld", 40);
		h.put("", 50);
		h.put(null, 60);
		System.out.println(h.put("HelloWorld", 70));// returns null if there is no match for that key...else returns oldValue that is overridden.

		System.out.println("Size of HashMap is "+h.size()); // returns the hashmap size

		print(h); // prints the hashmap using the method print(Map m)

		if(h.containsKey("Hey")){ // checks for specific key in the HashMap and returns true if present.
			Integer i = h.get("Hey"); // this is used to get the value associated with that key
			System.out.println("Hey is to be printed "+i); // printing the value
		}

		System.out.println();
		Map<String, Integer> h2 = new HashMap<>(h); // One way to create a copy of hashmap by using constructor with hashmap as attribute.
		System.out.println("Printing new copy of hashmap: ");
		print(h2);

		HashMap<String, Integer> h3 = new HashMap<>(10);
		h3.putAll(h2); // Other way to create a copy of hashmap using this method with hashmap passed as parameter.
		System.out.println("Copied hashmap using putAll() :");
		print(h3);
		System.out.println(" ");
		HashMap<String, Integer> h4 = (HashMap)h3.clone();
		System.out.println(h4 + " is the shallow cloned object.");
		System.out.println();

		System.out.println("KeySet in hashmap is "+h3.keySet()); // provides a set of all key in the hashmap.
		System.out.println("entrySet in hashmap is "+ h3.entrySet()); // provides a set of all entries in the hashmap.
		System.out.println("ValueSet in hashmap is "+ h3.values()); // provides a collection of all values in the hashmap.

		System.out.println();
		System.out.println("Keyset for loop: ");
		for(String s : h4.keySet()){ // iterate using keySet
			System.out.println(s);
		}

		System.out.println();
		System.out.println("values for loop: ");
		for(Integer i : h4.values()){ // iterate using values
			System.out.println(i);
		}

		System.out.println();
		printEMap(h4);
		System.out.println(h4); // this proves that any changes using entrySet/keySet/values will affect main hashset.
		System.out.println();

		if(h3.containsValue(20)){ // this method checks for that specific value and returns true if present.
			System.out.println(h3.remove("Hi")); // removes the K-V pair from hashmap and returns value of removed pair.
		}
		System.out.println(h3.remove("HelloHi")); // returns null if the key-valued pair is not present.
		print(h3);

		h.clear(); // used to clear all records in the hashmap.
		print(h); // printing empty hashmap.

	}

	public static void printEMap(Map hm){
		Iterator it = hm.entrySet().iterator();
		System.out.println("Using iterator using entrySet: ");
		while(it.hasNext()){
			Map.Entry p = (Map.Entry)it.next();
			System.out.println(p.getKey()+" "+p.getValue());
			it.remove();
		}
	}

	public static void print(Map<String, Integer> m){
		if(m.isEmpty()){ // checks for empty hashmap
			System.out.println("Map is Empty...");
		}else{
			System.out.println("Map is "+m);
		}
	}
}
