class WaitDemo implements Runnable{

	public void run(){
		System.out.println("run method..."+Thread.currentThread().getName());
		System.out.println("t1 woken up...");
		synchronized(this){
			notify();
		}
	}

	public 
	
	public static void main(String args[]){
		WaitDemo w = new WaitDemo();
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread(w,"t1");
		Thread t2 = new Thread(w,"main");
		Thread t3 = new Thread(w,"t1");
		t2.start();
		//t1.setName("t1");
		t1.start();
		t3.start();
		// try{							// Here this line of code is Sleeping Main thread for 1 sec and untill that t1 is executing.
		// 	Thread.sleep(1000);			// Hence notify call back will be missed here and the thread will go on waiting forever
		// }catch(InterruptedException e){	// untill someone call notify again.

		// }
		synchronized(w){
			try{
				System.out.println("block started");
				w.wait();	
				System.out.println("block ended");
			}catch(InterruptedException e){
				System.out.println("InterruptedException");
			}
		}
		System.out.println("Main ended...");
	}
}


// class Me{
// 	void dd(){
// 		Runnable r = () -> {
// 			System.out.println("run method..."+Thread.currentThread().getName()+"\n");
// 			System.out.println("t2 woken up...");
// 			synchronized(this){
// 				notify();
// 			}
// 		};
// 		new Thread(r).start();
// 	}
// }