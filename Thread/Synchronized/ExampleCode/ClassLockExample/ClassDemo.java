class ClassDemo{

	public static void m2(){
		System.out.println("Inside m2 method...");
		synchronized(String.class){ 								// Method returning Objects is also works fine...
			System.out.println("Inside sync StringLock class block...");
		}
		synchronized(Class.class){ 								// Method returning Objects is also works fine...
			System.out.println("Inside sync ClassLock class block...");
		}
		synchronized(A.class){ 								// Method returning Objects is also works fine...
			System.out.println("Inside sync A-Lock class block...");
		}
	}

	public static void main(String args[]){
		ClassDemo.m2();
	}
}