
class B {
	
	B(){
		System.out.println("Parent Constructor running!!");
	}

	void run(){
		System.out.println("This is Parent method running!!");
	}
	
}

class Overridding extends B{

	Overridding(){
		System.out.println("Child Constructor running!!");
	}
	void run(){
		System.out.println("This is Child method running!!");
	}

	void hide(){
		System.out.println("This method is hidden to Parent!!");
	}

	public static void main(String args[]){
		System.out.println("Main method running!!");
		B b = new B();
		b.run();
		Overridding o = new Overridding();
		o.run();
		B b1 = new Overridding();
		b1.run();
		//b1.hide();
	}
}
