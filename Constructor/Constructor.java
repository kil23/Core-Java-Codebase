
class A{
	{
		i=0;
		System.out.println("This is init block code A");
	}
	int i;
	A(){
		j = A(10); // This will call Parameterized constructor A

		//System.out.println("This is init block code A");

		System.out.println("Constructor A running "+i);
	}
	int j;
	int A(int c){

		//System.out.println("This is init block code A");
		System.out.println("Parameterized Constructor A running");
		return 1;
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
}

class Constructor{
	public static void main(String args[]){
		B b = new B(10); // It will start by calling parameterized Constructor B
		A a = new A(); // It will call parameterized Constructor A
	}
}