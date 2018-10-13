import java.lang.*;
//Class declaration can be done as follows..
/*
class Class{
	//fields
	//constructor
	//method declarations inside a class	
}
*/

class Class1{
	int a,b; // instance variables has unique value for each object
	static int c = 10; // static variable with only one copy for a class
	
	Class1(){  // Constructor with same name as class name
		a = 5; // default value for a and b in each object
		b = 8; 
	}

	static class Box{
		int width,height,depth;
		Class1 c = new Class1();
		void p(){
			System.out.println(c.a);
		}
	}

	public void add(int a , int c){
		System.out.println("Value of c from instance block using local variable: "+c); // accessing static variable from a non-static(instance) block
		System.out.println("Value of c from instance block using this: "+this.c);
		System.out.println("Accessing instance variables from instance method: "+(a + b)); // if no local variable is present, instance variable value is used
		System.out.println("Accessing instance variables from instance method using this: "+(this.a + this.b)); // instance variables value is used when this is used
	}

	public static void main(String args[]){
		Class1 obj = new Class1();  // creating an object of class to access non-static methods from static methods
		int c = 11; // local variable with same name as static varibale
		System.out.println("Value of c inside static block, printing local var: "+c); // local variable is preferred over a static variable
		System.out.println("Value of c from static block, printing static value using className: "+Class1.c); // static variables can be accessed in a static block using className
		obj.add(3,6);
		System.out.println("Value of instance variables is: "+obj.a+" "+obj.b);
		Box b1 = new Box();
		b1.p();
		b1.width = 5;
		b1.height = 6;
		b1.depth = 7;
		System.out.println("Width: "+ b1.width);
		System.out.println("Height: "+ b1.height);
		System.out.println("Depth: "+ b1.depth);
	}
}