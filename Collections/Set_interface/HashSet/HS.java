/*

HASHSET
- HS extends AbstractSet and implements the Set interface.
- Underlying DataStructure is HASHTABLE.
- HashTable use hashing to store information.
- In hashing, the informational content of a key is used to determine a unique value, called its hash code.
- The hash code is then used as the index at which the data associated with the key is stored.
- The transformation of the key into the its hash code is performed automatically.
- The advantage of hashing is that it allows the execution time of add(), contains(), remove() and size() 
  to remain constant even for large sets.
- It is generic " class HashSet<E> ".
- Duplicate is NOT allowed in Hashset.. If added using add() , no CE or RE is thrown, it just return false.
- Insertion order is not maintained as each item is inserted according to hashcode value.
- Heterogeneous elements are allowed with null included.
- implements Serializable and Cloneable but not RandomAccess.
- Best choice for Searching elements inside the Collection.
- Default hashset created is of size 16 and fill ratio of 0.75 
- HS has 4 constructor 1) HashSet() 2) HashSet(Collection <? extends E> c) 3) HashSet(int capacity) 
  4) HashSet(int capacity, float fillRatio) fillRatio determines how full HashSet can be before it resizes again.
  A constructor which does not take a fill ratio, 0.75 is used as default value for capacity.
- It doesnot define any additional methods beyond those provided by its superclass and interfaces.

*/

import java.util.*;

class HS{
	public static void main(String [] args){
		HashSet hs = new HashSet();
		hs.add("B");
		hs.add("B");
		hs.add(null);
		hs.add("P");
		hs.add("X");
		hs.add(16);
		hs.remove(-1);
		System.out.println(hs.add("X")); // false
 		System.out.println(hs);
		System.out.println(hs.size());

		Set<Short> s = new HashSet<>();
		for(short i=0;i<100;i++){
			s.add(i);
			s.remove(new Short(String.valueOf(i-1)));
		}
		System.out.println(s.size());
	}
}