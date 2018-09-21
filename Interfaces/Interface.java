/*
Interfaces are nothing but collections of abstract methods. 
A class can implement an interface thereby inheriting all abstract methods of the interface. 
An interface can extend an interface but only child class can implement those interfaces.
Interface methods are public and abstract by default.
Interface variables are public, static and final by default.
Interface can contain static methods as well with its implementation. Thus we can write Main() as well inside an Interface.
Interface also have Default method which are additional methods added later in the interface .
Interface cannot have an object. Hence static methods are allowed in Interface.
Interface do not have a Constructor to instantiate any variables of object.
Interface static or default methods are not inherited directly. They need to be called using Interface name.
Default methods act like non-static methods only and are inherited in the class that implements the interface.
Static methods can be called even if the child class doesn't implements the interface using Interface.method().
Default methods can be overriden in child class to have its own implementation.
*/

/*
A functional interface are interface with only one abstract method. They have only one functionality to exhibit. 
They can have any number of default methods.
@FunctionalInterface Annotation can be used to ensure that functional interface only have one abstract method.(Not mandatory)
We use lambda expression to instantiate Functional Interface and avoid bulky anonymous class implementation.
A functional interface may specify public method defined by Object, such as equals(), without affecting F.I. status.
Those public Object methods are considered as implicit members of functional interfaces becoz they are automatically 
implemented by an intance of functional interface.
*/

interface Sum{
	int i = 1;
	void add(int i, int j);
	default void add2(int i, int j){
		int sum = i + j;
		System.out.println(sum+ " Sum Default method");
	}
	static void add3(int i, int j){
		int sum = i + j;
		System.out.println(sum+ " Sum Static method");
	}
}

interface Add{
	int j = 2;
	void add(int i, int j);// No problem if we have Same name instance method in two interfaces as implementation is not provided.
	static void add3(int i, int j){ // Static methods are not inherited. We need to explicitly call method of interface. Thus Diamond problem never occurs in an Interface inheritance.
		int sum = i + j;
		System.out.println(sum+ " Add Static method");
	}
}

class Interface implements Sum,Add{
	public void add(int i, int j){ //If two methods have different return type but same name inside two Interfaces then Error is thrown. Return type not compatible.
		int sum = i + j;
		System.out.println(sum + " Abstract method");
 	}
 	public void add2(int i, int j){
		int sum = i + j;
		System.out.println(sum+ " class Default method");
	}
	public static void main(String[] args){
		Interface i = new Interface();
		i.add(3,5);
		i.add2(4,6);
		Sum.add3(5,7);
		Add.add3(6,8);
		System.out.println(Sum.i);
	}
}