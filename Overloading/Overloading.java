
class Overloading{
// A method can be overloaded by using same name as the previous method and passing either parameters
// with different datatypes or by passing different number of parameters with similar or different datatypes.
// Its a static polymorphism or Compile time binding or Early binding.

// If two methods of a class (whether both declared in the same class, or both inherited by a class, or one 
// declared and one inherited) have the same name but signatures that are not override-equivalent, then the 
// method name is said to be overloaded.

	/*static void Test1(int i, Integer j){
		System.out.println("Integer is 2nd arg");
	}*/

	static void add(Integer i, int j){
		System.out.println("Integer is 1st arg");
	}

	static void Test1(int i, int j, int... varargs){
		System.out.println("varargs");
	}

	static void Test1(int i, int arr[]){
		System.out.println("array");
	}

	static void add(int a, int b){
		int c = a + b;
		System.out.println(c);
	}

	static void add(float a, float b){
		float f = a + b;
		System.out.println(f);
	}

	static void add(int a , int b, int c){
		int d = a + b + c;
		System.out.println(d);
	}

	static void add(double a, double b, double c){
		double d = a + b + c;
		System.out.println(d);
	}

	static void add(float a, int b){
		float c = a + b;
		System.out.println(c);
	}

	static void add(int a, float b){
		float c = a + b;
		System.out.println(c);
	}

	public static void main(String args[]){
		add(3,5);
		add(3.0f,5.0f);
		add(3,5,8);
		add(3.0f, 5.0f, 8.0f); // Type promotion occurs when a datatype of smaller size is promoted to datatype of bigger size.
							   // If a match is found that method gets executed else type promotion takes place.
		add(3.0f, 5); // Order does matter in method overloading.But due to type promotion this is overriden.
		add(3, 5.0f);
		Test1(3,4);
	}
}