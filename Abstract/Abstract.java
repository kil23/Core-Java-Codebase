abstract class A{
	int i = 5;
	abstract void sum(int i, int j);
	abstract void sum(int i, float f); //Method overloading example
	void sum (float f, int i){  // Method Overloading example using concrete method inside abstract class
		float sum = f + (float)i;
		System.out.println(sum);
	}
}

class Abstract extends A{
	void sum(int i, int j){
		int sum = i + j;
		System.out.println(sum);
	}

	void sum(int i, float f){
		float sum = (float)i +f;
		System.out.println(sum);
	}

	void sum (float f, int i){  // Method Overridding example using concrete method
		float sum = f + (float)i;
		System.out.println(sum+" Overridding");
	}

	public static void main(String[] args){
		Abstract a = new Abstract();
		a.sum(2,3.5f);
		a.sum(2,3);
		a.sum(2.3f, 2);
		System.out.println(a.i);
	}
}