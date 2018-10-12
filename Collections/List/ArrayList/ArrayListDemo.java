/*
- Resizeable-array implementations of List Interface
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
		
		ListIterator li = a1.listIterator();
		while(li.hasNext()){
			li.next();
			li.set(123);
			li.add(11111);	
		}
		System.out.print(a1);

		List<String> letters = new ArrayList<String>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		int i = 0;
		for (String letter : letters) {
    		letters.set(i, "D");
		}
		System.out.print(letters);
	}
}

class ArrayListDemo {
	public static void main(String args[]){
		Test t = new Test();
		t.m1();
	}
}