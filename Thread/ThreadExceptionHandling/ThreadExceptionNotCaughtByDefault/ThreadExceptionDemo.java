class ThreadThrowingRuntimeException implements Runnable{
	public void run(){
		System.out.println("This thread method is throwing RuntimeException...");
		throw new RuntimeException(); // only RuntimeExceptions can be thrown from here because run method doesnot throw Checked Exception
									  // If you want to have CheckedException in the run() then you need to handle it inside the method only.
	}
}

public class ThreadExceptionDemo{
	public static void main(String args[]){
		try{
			new Thread(new ThreadThrowingRuntimeException(), "MyThread-1").start(); // RuntimeException is thrown here which cannot be caught by main thread.
			new Thread(new ThreadThrowingRuntimeException(), "MyThread-2").start();	// Hence this try-catch block is useless and stackTrace is printed by JVM.
			new Thread(new ThreadThrowingRuntimeException(), "MyThread-3").start(); // In order to catch these exception, implement UncaughtExceptionHandler interface.
		}catch(RuntimeException e){
			System.out.println("Exception from thread is caught ... "+e); // This line is never executed.
		}
	}
}