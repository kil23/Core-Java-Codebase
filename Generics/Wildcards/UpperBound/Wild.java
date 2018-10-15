/*
Upper Bound Wildcards shows that an upper bounded wildcard restricts the unknown type to be specific type or
subtype of that type and is represented by 'extends' keyword.
We use UBW when we need to read elements in the list with T and its subtypes in <? extends T>
*/

import java.util.*;

class Box{
	public static double sumOfList(List<? extends Number> list){
		double s = 0.0;
		//list.add(10.5); --> we cannot do this becoz we dont know if the list can hold Double (lets say its a Integer List).
		for (Number n : list){
			s += n.doubleValue();
		}
		return s;
	}
}

class Wild{
	public static void main(String [] args){
		List<? extends Integer> intList = new ArrayList<>();
		List<? extends Number>  numList = intList;
		List<Number> n = new ArrayList<>(); // This works perfectly fine as we are expected to pass Number list and we are doing that.
			n.add(new Integer());
			n.add(10.2);
		List<Integer> li = Arrays.asList(1,2,3); // In this case it work becoz we are passing predefined Interger list.
		List<Double> d = Arrays.asList(1.2,2.3,3.4); // same .. here we have Double list
		System.out.println("Sum of list is "+ Box.sumOfList(li));
		System.out.println("Sum of list is "+ Box.sumOfList(n));
		System.out.println("Sum of list is "+Box.sumOfList(d));
	}
}