// No constructor as it is nameless.
// They can have local classes as well.
// They can have final static variables.
// They cannot have static members or interfaces inside.
// They are not accessible from another class.

class Popcorn{
	public void pop(){
		System.out.println("salty");
	}
}

interface Cutter{
	public static void cut();
}

class Anonymous{
	public static void main(String... args){
		
		Popcorn p = new Popcorn(){
			public void pop(){
				System.out.println("sweet");
			}
		};
		p.pop();

		Cutter c = new Cutter(){
			public static void cut(){
				System.out.println("Cutter interface running...");
			}
		};
		c.cut();
	}
}