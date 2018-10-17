class MyClass extends Thread{

	public static ThreadLocal v = new ThreadLocal(){
		protected Object initialValue(){
			return new Integer(x--);
		}
	};

	private static int x = 10;

	MyClass(String name){
		super(name);
		start();
	} 

	public void run(){
		for(int i=0;i<2;i++)
		System.out.println(getName()+ " "+ v.get());
	}
}

class ThreadLocalDemo{
	public static void main(String args[]){
		MyClass t0 = new MyClass("Thread-0");
		MyClass t1 = new MyClass("Thread-1");
		MyClass t2 = new MyClass("Thread-2");
		MyClass t3 = new MyClass("Thread-3");
	}
}