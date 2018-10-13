/*
The basic difference between List<?> and List<Object> is that u can insert Object or any subtype of Object into List<Object>.
But you can only insert null into a List<?>.
That's why List<?> are used when the code is duing methods that don't depend on the type parameter.
e.g. List.size or List.clear ...
*/

import java.util.*;
class Unb{

	public static void printList(List<Object> l){ // Capable of printing only object instances
		for(Object e : l){  		// It cannot print List<Integer> , List<Double> , List<String>
			System.out.println(e + " "); // bcoz they are not subtypes of List<Object>
		}
	}

	public static void printList1(List<?> l){ // Using this u can print any type of list
		for(Object e : l){					// This is Unbounded Wildcards
			System.out.println(e+ " ");
		}
	}
	public static void main(String args[]){
		List<Integer> i1 = Arrays.asList(1, 2, 3, 4);
		List<String> i2 = Arrays.asList("one", "two", "three");
		printList1(i1);
		printList1(i2);
		//printList(i1)  ---> gives error as i1 list is not an Object list
	}
}