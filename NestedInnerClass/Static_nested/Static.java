class Outer{
	//int x = 5;
	static int y = 3;
	static class Inner{
		void m1(){
			System.out.println(y);
	//		System.out.println(x);
		}
		static void m3(){
			System.out.println("static method running...");	
		}
	}

	void m2(){
		Inner().m3();
	}

	public static void main(String[] args){
		Inner i = new Inner();
		i.m1();
		new Outer().m2();
	}
}

class Static{
	public static void main(String[] args){

	}
}