class RuntimeExceptionThrown implements Runnable{
	public void run(){
		throw new RuntimeException();
	}
}

class ThreadExceptionHandler implements Thread.UncaughtExceptionHandler{

	private String handlerId;

	public ThreadExceptionHandler(String handlerId){
		this.handlerId = handlerId;
	}

	public ThreadExceptionHandler(){

	}

	public void uncaughtException(Thread t, Throwable e){
		System.out.println(this + " caught Exception in "+ t.getName()+" -> "+e+" "+handlerId);
	}
}

class PerThreadExceptionHandler{
	public static void main(String args[]){

		Thread t1 = new Thread(new RuntimeExceptionThrown(), "MyThread-1");
		t1.setUncaughtExceptionHandler(new ThreadExceptionHandler("Thread-1 handler")); // This will print exception with different hashcode of ThreadExceptionHandler
		Thread t2 = new Thread(new RuntimeExceptionThrown(), "MyThread-2"); 
		t2.setUncaughtExceptionHandler(new ThreadExceptionHandler("Thread-2 handler")); // A different hashcode withh be printed here
		Thread t3 = new Thread(new RuntimeExceptionThrown(), "MyThread-3");
		t3.setUncaughtExceptionHandler(new ThreadExceptionHandler("Thread-3 handler"));	// Hence, we can say that each invocation uses new object of ThreadExceptionHandler

		t1.start();
		t2.start();
		t3.start();
	}
}