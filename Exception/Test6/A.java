class A{
	{
		try{
		throw new Exception();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public A() throws Exception{
		System.out.println(10);
	}

	void m1(){
		String s = null;
		String str = "Str";
		String ss = s.concat(str);
		System.out.println(ss);
	}
	
	public static void main(String args[]){
		try{
			A a = new A();
			a.m1();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}