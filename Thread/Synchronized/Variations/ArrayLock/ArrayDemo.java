
class ArrayDemo{
	public void m1(){
		System.out.println("Inside m1 method...");
		
		synchronized(new int[10]){
			System.out.println("Inside sync array block...");	// Works perfectly fine
		}
	}

	public static void main(String args[]){
		ArrayDemo ad = new ArrayDemo();
		ad.m1();
	}
}