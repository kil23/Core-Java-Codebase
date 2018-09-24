/*
Lower Bounded Wildcard restricts the unknown type to be a specific type or a super type of that type.
Its represented as <? super A>.
Its used when u want to write a method that puts Integer objects into a list.
To maximize flexibility, you would like the method to work on List<Integer>, List<Number> and List<Object> 
anything that can hold an Integer. Hence Lower Bounded Wildcards are used here.
So we use LBW to insert elements with T  in <? super T>.
*/

import java.util.*;
class Low{

	public static void addNumber(List<? super Integer> l){
		for(int i=0;i<10;i++){
			l.add(i);
		}
		System.out.println(l);
	}

	public static void main(String args[]){
		List<Number> l = new ArrayList<Number>();
		addNumber(l);
	}
}