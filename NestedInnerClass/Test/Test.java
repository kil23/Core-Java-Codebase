class A{
	class B{
		public void m1(){
			System.out.println("A.B running...");
		}
	}
}

class Test extends A{

	public void show(){
		Test.B b1 = new Test().new B(); // Test.B running...
		b1.m1();
		B b2 = new Test().new B(); // Test.B running...
		b2.m1();
		//A.B b3 = new Test().new B(); Test.B cannot be converted to A.B
		//b3.m1();
		A.B b4 = new A().new B(); // A.B running...
		b4.m1();
		// If same name Inner class not present in child class then 
		// B b = new B(); b.m1() will work...
	}

	class B{
		public void m1(){
			System.out.println("Test.B running...");

		}

	}

	public static void main(String args[]){
		Test t = new Test();
		t.show();
	}	
}