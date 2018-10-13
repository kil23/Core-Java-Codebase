class Outer{
	int outer_x = 100;

	void test(){
		Inner in = new Inner();
		in.display();
	}

	class Inner{
		int y = 10;

		void display(){
			System.out.println("Display: outer_x = "+outer_x);
		}
	}

	static class StaticInner{ // Static Nested Class
		int z = 10;
		static int z1 = 11;
		
		static void dis(){
			Outer o1 = new Outer();
			System.out.println("Static method of Static Nested class: "+z1);
			System.out.println("Static method of Static Nested class: "+o1.outer_x);
		}

		void d(){
			System.out.println("Instance method of Static Nested class");
		}
	}

	void t1(){
		for(int i=0;i<5;i++){
			class MethodInner{ // Method Local Inner Class

				void disp(){
					System.out.println("Inner class within a for_loop: "+outer_x);
				}

				void d1(){
					System.out.println("Another method inside 1st MLIC");
				}
			}
			class Met{
				void d2(){
					System.out.println("Another class inside MLIC");
				}
			}
			MethodInner in1 = new MethodInner(); // Object creation of Method Local Inner class
			in1.disp();
			in1.d1();
			Met x = new Met();
			x.d2();
		}
	}

	public static void main(String args[]){
		Outer.Inner i = new Outer().new Inner(); // Accessing Inner(non-static) class from within an Outer class
 		i.display();
 		StaticInner. dis();
	}
}

class Nested_Inner {
	public static void main(String args[]){
		Outer out = new Outer();
		Outer.Inner i = out.new Inner();
		i.display(); // Accessing Inner class from outside of Outer class
		
		System.out.println();
		
		out.test(); // Accessing method of Outer class
		out.t1(); //Accessing method of Outer class which contains Inner class
		System.out.println(Outer.StaticInner.z1); // Accessing static variable of Static Nested class
		Outer.StaticInner inner2obj = new Outer.StaticInner();
		System.out.println(inner2obj.z); // Accessing instance variable of Static Nested class
		Outer.StaticInner.dis(); // Accessing Static method of Static Nested class
		inner2obj.d();
	}
}