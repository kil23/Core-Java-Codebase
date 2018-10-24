/*
- Underlying DataStructure is HASHTABLE
- Duplicate is NOT allowed in Hashset.. If added using add() , no CE or RE is thrown, it just return false.
- Insertion order not maintained.
- Heterogeneous elements are allowed with null included.
- implements Serializable and Cloneable but not RandomAccess.
- Best choice for Searching elements inside the Collection.
- Default hashset created is of size 16 and fill ratio of 0.75 
- Ordering is based on the hashCode for those objects.
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
		System.out.println(hs.add("X")); // false
 		System.out.println(hs);
		System.out.println(hs.size());
	}
}