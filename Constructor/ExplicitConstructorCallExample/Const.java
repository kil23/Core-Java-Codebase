class Const{
	final int i;

	Const(){
		i = 5;
	}

	public void m1(){
		this.Const();  // Throws a Compile time error saying that cannot find Const() symbol... 
						// Constructors can only be called at the time of object creation and during constructor chanining. 
	}

	public static void main(String args[]){
		Const c = new Const();
		c.m1();
	}
}