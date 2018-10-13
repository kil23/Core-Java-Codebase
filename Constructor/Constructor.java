
class A{
	{
		i=0;
		System.out.println("This is init block code A");
	}
	int i;
	A(){
		this(10); // This will call Parameterized constructor A

		//System.out.println("This is init block code A");

		System.out.println("Constructor A running "+i);
	}
	int j;
	A(int c){

		//System.out.println("This is init block code A");
		System.out.println("Parameterized Constructor A running");
	}
}

class B extends A{
	{
		System.out.println("This is init block code B");
	}
	B(){
		super(); // This will call no-arg Constructor A
		System.out.println("Constructor B running");
	}
	B(int a){
		this(); // This will call no-arg Constructor B
		System.out.println("Parameterized Constructor B running");
	}
	public static void main(String args[]){
		
	}
}

class Constructor{
	{
		System.out.println("Constructor");
	}
	public static void main(String args[]){
		B b = new B(10); // It will start by calling parameterized Constructor B
		A a = new A(); // It will call parameterized Constructor A
	}
}