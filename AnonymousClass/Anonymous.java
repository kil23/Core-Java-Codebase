
class Walk{
	int speed = 5;
	void distance(){
		System.out.println("Speed of walking: "+speed);
	}
}

interface Runnable{
	int x = 20;
	void run();
}

interface Age{
	int x =21;
	void getAge();
}

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

		Walk w = new Walk(){
			public void distance(){
				System.out.println("Anonymous class walk class running...");
			}
		};
		w.distance();

		System.out.println();

		Runnable r = new Runnable(){
			public void run(){
				System.out.println("new Runnable interface implemented.."+x);
			}
		};
		r.run();

		System.out.println();

		Age a = new Age(){
			public void getAge(){
				System.out.println("Age is "+x);
			}
		};
		a.getAge();

		System.out.println();

		Popcorn p1 = new Popcorn();
		System.out.println(p1.getClass().getName());
		p1.pop();
	}
}