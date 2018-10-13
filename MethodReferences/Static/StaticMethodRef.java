/*
Method References provides a way to refer to a method without executing it.
*/
import java.util.*;

interface Add{
	void addNum();
}

class StaticMethodRef{

	public static void print(final int number){
		System.out.println("This is printing method..."+number);
	}

	public static void sum(){
		System.out.println("sum method running...");
	}

	public static void main(String[] args){
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		//normal
		for(int num : list){
			StaticMethodRef.print(num);
		}

		//lambda expression
		list.forEach(num -> StaticMethodRef.print(num));

		//Method reference
		list.forEach(StaticMethodRef::print);
		Add add = StaticMethodRef::sum;
		add.addNum();

	}
}