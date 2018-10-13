/*
Abstract classes are created when we want to a superclass to declare the structure of given abstraction 
without providing a complete implementation of every method.
It determines the nature of the methods that the subclasses must implement.
							"abstract type-name(parameter-list)"
Abstract classes in java is a superclas that cannot be instantiated and is used to state or define general characteristics.
Abstract classes should have abstract keyword assigned to it if that class have zero or more abstract methods.
Abstract class can have Constructor inside its definition.
Abstract classes can be extended by their child classes to have implementation of abstract methods.
They can have concrete methods as well which will be inherited by the child class.
Multiple inheritance is not supported by java in case of Classes.
One class can only extend one class.Hence we need to use interfaces in that case.
Concrete method of this class can be final if you dint want child class to override the method implementations.
We cannot declare a method as final and abstract simultaneously.
*/

abstract class A{
	int i = 5;
	abstract void sum(int i, int j);
	abstract void sum(int i, float f); //Method overloading example
	void sum (float f, int i){  // Method Overloading example using concrete method inside abstract class
		float sum = f + (float)i;
		System.out.println(sum);
	}
}

class Abstract extends A{
	void sum(int i, int j){
		int sum = i + j;
		System.out.println(sum);
	}

	void sum(int i, float f){
		float sum = (float)i +f;
		System.out.println(sum);
	}

	void sum (float f, int i){  // Method Overridding example using concrete method
		float sum = f + (float)i;
		System.out.println(sum+" Overridding");
	}

	public static void main(String[] args){
		Abstract a = new Abstract();
		a.sum(2,3.5f);
		a.sum(2,3);
		a.sum(2.3f, 2);
		System.out.println(a.i);
	}
}