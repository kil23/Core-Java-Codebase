// Not accessible outside the method scope. You need to call the method and can create object of classes
// inside the method area .
// They cannot have static methods or classes or interfaces inside a method local inner class 
// as they need to access instance members of enclosing body.
// Static is only allowed in constant variable declaration.

class Outer{
	int i = 0;
	static int j = 1;
	void methodLocal(){
		int i = 5;
		class Inner{ // Cannot have static class or methods as Local classes need to access instance members of encloseing body 
			int i = 10; // Only variables can be made static inside a Local inner class.
			//AnotherInner ai = new AnotherInner();
				
			void m1(){
				int i = 20;
				//System.out.println("Inner class "+ai.i);
				System.out.println("Inner class "+i);
				System.out.println("Inner class "+this.i);
				System.out.println("Inner class "+Outer.j);
				System.out.println("Inner class "+Outer.this.i);
			}
		}

		class AnotherInner{
			int i = 15;
			void m2(){
				int i = 25;
				System.out.println("AnotherInner class");
			}
		}

		Inner i1 = new Inner();
		i1.m1();

		AnotherInner ai = new AnotherInner();
		ai.m2();

		System.out.println("MethodLocal method executing...");

	}

	public static void main(String [] args){
		Outer o = new Outer();
		o.methodLocal();
	}
}

class MethodLocal{
	public static void main(String [] args){

	}
}