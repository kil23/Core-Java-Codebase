// All members are accessible to Outer class even if Inner class members are private due to class scope by creating objects.
// Inner class can access Outer class private members directly even without using objects.
// No super keyword in Inner class as its not extending Outer class.But we can use it in Outer class
// to invoke Object class method or variables.

class Outer{
	private int i = 5;
	private class Inner{
		
		private int i = 50;
		void m1(){
			System.out.println(Outer.this.i);
			//System.out.println(this.i);
			//System.out.println(Inner.this.i);
			System.out.println(i);
		}
		void m3(){
			Inner o = new Inner();
			InnerClass.m2(o);
			System.out.println(o.i);		
			AnotherInnerClass a = new AnotherInnerClass();
			a.m4();
			System.out.println(a.i);
		}

	}

	class AnotherInnerClass{
		private int i = 20;
		void m4(){
			System.out.println("AnotherInnerClass method executing...");
			System.out.println("AnotherInnerClass method executing..."+new Inner().i);
		}
	}

	public static void main(String[] args){
		Outer.Inner o = new Outer().new Inner();
		o.m3();
		Outer.AnotherInnerClass oa = new Outer().new AnotherInnerClass();
		System.out.println(oa.i);
	}
}

class InnerClass{

	static void m2(Object o){
		System.out.println("Method 2 running..."+ o);
	}

	public static void main(String[] args){
		Outer o = new Outer();
		//Outer.Inner i = o.new Inner();
		//i.m1();
		Outer.AnotherInnerClass oa = o.new AnotherInnerClass();
		//System.out.println(oa.i);
	}
}