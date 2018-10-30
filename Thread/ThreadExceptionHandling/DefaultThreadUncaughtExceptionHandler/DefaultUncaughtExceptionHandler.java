class RuntimeExceptionThrown implements Runnable{
	public void run(){
		// System.out.println("RuntimeException is thrown in this thread ...");
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

public class DefaultUncaughtExceptionHandler {

	public static void main(String args[]){
		Thread.setDefaultUncaughtExceptionHandler(new ThreadExceptionHandler("Default_Handler")); // This method is static and is used by all threads which are
																								  // throwing Runtime Exceptions.
		new Thread(new RuntimeExceptionThrown(), "Thread-1").start(); 
		new Thread(new RuntimeExceptionThrown(), "Thread-2").start(); // So object with same hashcode will be printed here in all thread method call.
		new Thread(new RuntimeExceptionThrown(), "Thread-3").start();
	}
}