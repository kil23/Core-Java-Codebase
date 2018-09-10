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

	static class Inner2{
		int z = 10;
		static int z1 = 11;
		static void dis(){
			System.out.println("Static Inner class: "+z1);
		}
	}

	void t1(){
		for(int i=0;i<5;i++){
			class Inner1{

				void disp(){
					System.out.println("Inner class within a for_loop: "+outer_x);
				}
			}
			Inner1 in1 = new Inner1();
			in1.disp();
		}
	}
	/*void showy(){
		System.out.println("Variable y inside a inner class: "+y); // CE: y cannot be found.
	}*/
}

class Nested_Inner {
	public static void main(String args[]){
		Outer out = new Outer();
		out.test();
		out.t1();
		System.out.println(Outer.Inner2.z1);
		Outer.Inner2 inner2obj = new Outer.Inner2();
		System.out.println(inner2obj.z);
		Outer.Inner2.dis();
	}
}