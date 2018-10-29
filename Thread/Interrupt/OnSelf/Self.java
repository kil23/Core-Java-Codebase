class Self implements Runnable{
	static Thread t1;
	static int count = 0;
	public void run(){
		System.out.println("run method...");
		try{
			Thread.sleep(100);
			System.out.println(t1.isAlive());
			t1.interrupt();						// interrupt() is non-static method which interrupts the thread and set interrupt status flag.
		}catch(InterruptedException e){
			System.out.println("Interrupt");
		}
		System.out.println("child thread completed...");  
	}

	public static void main(String args[]){
		
		t1 = Thread.currentThread();
		Self s = new Self();
		Thread t = new Thread(s);
		t.start();

		for(int i =0;i<100000;i++){
			for(int j =0;j<100000;j++){
			count++;
		}
		}
		System.out.println(count);

		if(Thread.interrupted()){  		  // interrupted() is a static method called on Thread class. It returns boolean and reset the interrupt status flag to false.
			System.out.println("main thread Interrupted...");  // Not interrupted yet... Hence this is not executed...
		}
		System.out.println(Thread.currentThread().getName()+" thread completed..."); 
		
		//Main thread will exit without being interrupted and no exception will be thrown, interrupt call will be wasted ...
		//if we write below statement then Main thread will wait and get interrupted by child thread.

		// try{
		// 	t.join();
		// }catch(InterruptedException e){
		// 	System.out.println("Interrupted Exception ");
		// }
	}
}