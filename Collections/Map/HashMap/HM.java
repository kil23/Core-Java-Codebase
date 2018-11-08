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
  So in order to avoid this, they are converted into trees ehich have O(log n) time now.
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

class HM{
	public static void main(String args[]){
		HashMap<String, Integer>h = new HashMap<>();
		h.put("Hey", 10);
		h.put("Hi", 20);
		h.put("Hello", 30);
		System.out.println(h.put("Hey", 50));

		System.out.println("Size of HashMap is "+h.size());

		print(h);

		if(h.containsKey("Hey")){
			Integer i = h.get("Hey");
			System.out.println("Hey is to be printed "+i);
		}
		h.clear();
		print(h);

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
