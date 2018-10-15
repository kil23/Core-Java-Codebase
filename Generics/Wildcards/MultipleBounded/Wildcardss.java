class Bound<T extends A & B>{
	private T objRef;

	public Bound(T obj){
		this.objRef = obj;
	}

	public void doRunTest(){
		this.objRef.displayClass();
	}
}

interface B{
	public void displayClass();
}

class A implements B{
	public void displayClass(){
		System.out.println("Inside super class A");
	}
}

class Wildcardss{
	public static void main(String []args){
		Bound<A> b = new Bound<A>(new A());
		b.doRunTest();
		Bound<Wildcardss> c = new Bound<Wildcardss>(new Wildcardss());
		c.doRunTest();

	}
}