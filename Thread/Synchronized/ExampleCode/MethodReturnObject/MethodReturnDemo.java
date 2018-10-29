class MethodReturnDemo{
	public static Object m1(){
		System.out.println("Inside m1 method...");
		return new Object();
	}

	public static void m2(){
		System.out.println("Inside m2 method...");
		synchronized(m1()){ 								// Method returning Objects is also works fine...
			System.out.println("Inside sync block...");
		}
	}

	public static void main(String args[]){
		MethodReturnDemo.m2();
	}
}