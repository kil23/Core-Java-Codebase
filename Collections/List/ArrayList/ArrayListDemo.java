/*
ARRAYLIST
- Resizeable-array implementations of List Interface(dynamic array growth).
- It extends AbstractList class which implements List interface.
- ArrayList is created with initial size of 10 and if afterwards size exceeds than 10 then collection is 
  automatically enlarged by 50% of the earlier size. If elements are removed then arrayList can be shrunk as well.
- Thus , AL is a variable-length array of object references.
- It has 3 constructor: (1) no-arg (builts empty AL) (2) with Collection<? extends E> c (bulids AL that is initialized
  with the elements of the collection c) (3) with capacity (builds AL with capacity value size).
- In order to increase the capacity of an AL is by manually calling ensureCapacity(int capacity) and if you want to
  decrease the capacity of an AL then use trimToSize() which will trim it to exact number of elements in the AL.
- To obtain an array that contains the elements of the AL use " Object[] toArray() " or " <T> T[] toArray(T array[])".
- AL implements RandomAccess interface which is marker interface and thus provides fast random-access when you iterate
  over an AL collection. 
- All operations are done in O(1) time like size(), isEmpty(), get(0, set(), iterator() and listIterator() except add() 
  which takes O(n) time.
- AL implementation is not synchronized i.e multiple threads can perform AL operation concurrently. So if we need thread
  safety, synchronization should be done externally by using
  				 Collections.synchronizedList(new AL()) 
- It throws ConcurrentModificationException if any modifications(remove or add) is done after creation of Iterator. In order
  to make changes afterward use ListIterator's add() or remove() method.
- modCount field keeps tract of number of times the list has been structurally modified. So every method that modifies list 
  increments the value of this field by 1. 
  modCount is checked in ListIterator, Iterator and forEach type iterators. ConcurrentModificationException is thrown if any
  time list has been changed and its an unchecked exception.
  modCount is incremented in clear(), remove(index), fastRemove(index), removeRange(fromIndex, toIndex), removeIf(Predicate), replaceAll(), sort(), trimToSize(),
  ensureExplicitCapacity(capacity).
- remove(index) uses System.arraycopy() to remove and element and returns oldValue of the element removed.
- set(index, element) also returns OldValue which is being replaced.
- remove(Object o) returns boolean and uses fastRemove(index) which also uses System.arraycopy().

*/

import java.util.ArrayList;
import java.util.*;

class Test{
	void m1(){
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>(20);
		a1.add(1);
		a1.add(11);
		a1.add(111);
		a1.add(1111);
		a1.add(11111);
		System.out.println(a1.size());
		a1.remove(new Integer(11)); // Either pass Index or Object of element to be removed.. Thats the only way to remove elements.
		System.out.println(a1.size()+" ---> 11 removed?");
		a1.remove(3); // here it takes 3 as index and remove element at 4th position as AL index starts with zero. 
		//a1.remove(-1);
		a2.add(11);
		a2.add(0,1);
		System.out.println(a1.size());
		System.out.println(a2.size());
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.equals(a2));

		//for(Integer i: a1){
			// if(a1.size()<5){
			// 	a1.add(11111);
			// }

//********************************************************************************************************************************************		
		// ArrayList coverted to array and printed the sum of all elements.
		Integer iarr[] = new Integer[a1.size()];
		iarr = a1.toArray(iarr);

		int sum =0;

		for(int j : iarr) sum += j;

		System.out.println("Sum is : "+sum);

//********************************************************************************************************************************************		

		ListIterator li = a1.listIterator();
		while(li.hasNext()){
			li.next();
			li.set(123);
			li.add(11111);	
		}
		System.out.println(a1);

		List<String> letters = new ArrayList<String>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		int i = 0;
		for (String letter : letters) {
    		letters.set(i, "D");
		}
		System.out.println(letters);

//********************************************************************************************************************************************		
		List<? extends Number> a = new ArrayList<Integer>();
		a.add(null);
		List<Float> l = new ArrayList<>(a);
		l.add(6.0);
		
		System.out.println(l);
	}
}

class ArrayListDemo {
	public static void main(String args[]){
		Test t = new Test();
		t.m1();
	}
}