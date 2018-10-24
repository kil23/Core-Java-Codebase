class CustromizedError extends Error{
	void m1(){
	System.out.println("customized error");
	}
}

class TCE{

	void m1(){
		try{
			throw new CustromizedError();
		}catch(CustromizedError e){
			System.out.println("C-Error");
		}
		System.out.println("Hello");
	}

	public static void main(String args[]){
		TCE t = new TCE();
		t.m1();
		System.out.println("World");
	}
}