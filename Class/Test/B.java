class A{
	final int a1;
	A(){a1 = 10;}

	static void test(){
		
	}
}

class B extends A{

	static String str;
	public static void main(String []args){
		A a = new B();
		System.out.println(a);
		System.out.println(new A().a1);
		System.out.println(str);
	}
}