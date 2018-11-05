/*

VECTOR
- It is same as ArrayList.
- Only one difference is that methods are synchronized for thread safety.
- Each operation is synchronized and hence we have performance hit using vector.
- It also implements RandomAccess marker interface which provides faster access through the collection.
- It extends AbstractList and implements List interface.
- It creates a Vector of initial capacity of 10.
- Each Vector has capacity and capacityIncrement which is useful to optimize storage space. The capacity is always atleast as large
  as vector size, it is usually larger because as components are added to the vector , vector's storage increases in chunks of size 
  of capacityIncrement. 
- If thread-safe implementation is not needed, it is recommended to use ArrayList in place of Vector.
- If you need synchronization, a Vector will be slightly faster than an ArrayList synchronized with Collections.synchronizedList.

*/


import java.util.Vector;
import java.util.LinkedList;
import java.util.List;

class V{
	public static void main(String[] args){
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(5);
		v.add(8);
		v.add(3,4);
		v.add(5,6);
		v.add(6,7);
		System.out.println("Vector is " + v); 

		List<String> names = new LinkedList<>();
		names.add("Vaishnavi");
		names.add("Aisha");
		names.add("Pranav");

		Vector<String> v1 = new Vector<>();
		v1.addAll(names);
		System.out.println("Vector is "+ v1);
		System.out.println("Vector is "+ v1.capacity());
		System.out.println("Vector is "+ v1.size());
		v1.remove("Pranav");
		System.out.println("Vector is "+ v1.capacity());
		System.out.println("Vector is "+ v1.size());
		v1.trimToSize();
		System.out.println("Vector is "+ v1.capacity());

	}
}