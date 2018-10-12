

class Test implements Runnable{
	public void run(){
		System.out.println("run() is running...");
	}

	public void m1(){
		System.out.println("run() is running...");
	}
}

class ThreadDemo{
	public static void main(String[] args){
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
		
		Thread t2 = new Thread(t);
		t2.start();

	}
}