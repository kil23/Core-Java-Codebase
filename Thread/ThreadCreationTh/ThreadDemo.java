class MyThread extends Thread{
	static MyThread t;
	static MyThread t2;
	public void run(){
		System.out.println("Thread class run method overloaded...");
		t.m2();
	}

	public synchronized void m2(){
		try{
			System.out.println(t.getState());
			System.out.println(t2.getState());
		System.out.println("sleeping  start "+Thread.currentThread().getName()+ " ");
			Thread.sleep(1000);
		System.out.println("sleeping  ended "+Thread.currentThread().getName());

		}catch(InterruptedException e){}
		System.out.println("Thread ..."+Thread.currentThread().getName());

	}

	public static void main(String args[]){
		t = new MyThread();
		t2 = new MyThread();
		t.start(); // Thread is started at this limit...
		t2.start();
		try{
		System.out.println("sleeping...main thread");
		Thread.sleep(100);
		System.out.println("sleeping... ended main  ");
		}catch(InterruptedException e){}
			System.out.println("main "+t.getState());

		t.m2();
		System.out.println("Thread creation completed");
		//t.run(); // Its a normal method call of Class MyThread...
	}
}