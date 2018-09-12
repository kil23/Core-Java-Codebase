final class A{
	public void m1(){
		System.out.println("class A method running...");
	}
}
/*
class B extends A{  // This will give error bcoz final classes cannot inherited
	public void m1(){
	System.out.println("class B executing...");
	}	
}
*/

class B {
	final int a;
	final int b = 5;
	static int i;
	final Integer j=5;
	static {
		 i = 7;
	}

	{
		a = 5;
	}


	public Integer b1(){
		System.out.println("class B is executing...");
		System.out.println(j);
		System.out.println(b);
		A a = new A();
		a.m1();
		return new Integer(j);
	}
}

class Final{
	public static void main(){
		B b = new B();
		A a = new A();
		a.m1();
		// A c = new B();
		// c.m1();

	}
}