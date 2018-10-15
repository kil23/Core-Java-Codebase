class Box<T extends Number>{
	private T t;
	public void set(T t){
		this.t = t;
	}
	public T get(){
		System.out.println(t);
		return t;
	}

	public void getClassName(Object o){
		System.out.println(o.getClass().getName());
	}
}

class Wildcardss{
	public static void main(String args[]){
		Box<Integer > b = new Box<>();
		b.set(10);
		b.get();
	}
}