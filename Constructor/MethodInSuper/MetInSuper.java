
class A {
	A(int a){
		System.out.println("A constructor");
	}
}

class B extends A{
	B(){
		this(10);
		System.out.println("B noargs constructor");
	}
	B(int a){
		super(m1(10));
		System.out.println("A parameterized constructor");

	}

	static int m1(int a){
		return a;
	}
}

class MetInSuper{
	public static void main(String args[]){
		B b = new B();
	}
}

/*
OUTPUT :

A constructor
A parameterized constructor
B noargs constructor

 */