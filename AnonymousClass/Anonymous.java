
class Popcorn {	
	public void pop(){
		System.out.println("Popcorn class pop function running...");
	}
}

class Anonymous{
	public static void main(String args[]){
		Popcorn p = new Popcorn(){
			public void pop(){
				System.out.println("Anonymous class pop function running...");
			}
		};
		System.out.println();
		System.out.println(p.getClass().getName());

		p.pop();

		System.out.println();

		Popcorn p1 = new Popcorn();
		System.out.println(p1.getClass().getName());
		p1.pop();
	}
}