
class StringDemo{
	public void m1(){
		System.out.println("Inside m1 method...");
		
		synchronized("str"){
			System.out.println("Inside sync string block...");	// Works perfectly fine
		}
	}

	public static void main(String args[]){
		StringDemo sd = new StringDemo();
		sd.m1();
	}
}