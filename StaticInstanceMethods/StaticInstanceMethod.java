

class Test{

	{
		System.out.println("Init block");
	}

	void t1(){
		System.out.println("Instance method");
		System.out.println("Calling static method now ...");
		t2(); // Calling static method directly that is present inside the same class.
	}

	static void t2(){
		System.out.println("Static method"); // We need to create an object of class if we need to call instance method.
	}

	public static void main(String[] args){
		Test t = new Test();
		t.t1();
		t2();
	}
}

class StaticInstanceMethod extends Test{
	void t1(){
		System.out.println("Instance method with same name as instance method");
	}

	public static void main(String [] args){
		Test t = new Test();
		StaticInstanceMethod staticInstanceMethod = new StaticInstanceMethod();
		Test t1 = new StaticInstanceMethod();
 		t.t1(); // a call to t1 method of class Test will happen in this case.
		staticInstanceMethod.t1(); // t1 method of this class will run normally as we are using object of same class.
		t1.t1(); // Overridden method t1 of this class will run in this case.
		t2(); // Calling static method of another class using the name of the class, dot operator and method name.
	}
}