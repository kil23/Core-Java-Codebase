class MyThread extends Thread{
	public void run(){
		System.out.println("Thread class run method overloaded...");
	}
}

class ThreadDemo{
	public static void main(String args[]){
		MyThread t = new MyThread();
		Thread th = new Thread(t);
		th.start(); // Thread is started at this limit...
		System.out.println("Thread creation completed");
		t.run(); // Its a normal method call of Class MyThread...
	}
}