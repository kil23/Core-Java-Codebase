
class Gen<T> {
	T ob; 

	Gen(T o) {
		ob = o;
	}

	T getob() {
		System.out.println(ob);
		return ob;
	}
}

class Gen2<T, V> extends Gen<T> {
	V ob2;
	Gen2(T o, V o2) {
		super(o);
		ob2 = o2;
	}
	V getob2() {
		return ob2;
	}
}

class HierDemo {
	public static void main(String args[]) {

		Gen2<String, Integer> x1 = new Gen2<String, Integer>("Value is: ", 99);
		Gen<String> x2 = new Gen2<String, Integer>("Value is: ", 99);
		System.out.print(x1.getob());
		System.out.println(x1.getob2());
	}
}