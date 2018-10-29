class MethodAccessProb{
	static MethodAccessProb obj1 = new MethodAccessProb();
	static MethodAccessProb obj2 = new MethodAccessProb();
	static MethodAccessProb obj3 = new MethodAccessProb();

	synchronized void syncMethod(){
		try{
			System.out.println("synchronized Method starts ==> "+Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("synchronized Method ends --> "+Thread.currentThread().getName());
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	synchronized void duplicateSyncMethod(){
		try{
			System.out.println("duplicate synchronized Method starts ==> "+Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("duplicate synchronized Method ends --> "+Thread.currentThread().getName());
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	static void staticMethod(){
		try{
			System.out.println("static Method starts ==> "+Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("static Method ends --> "+Thread.currentThread().getName());
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	synchronized static void staticSyncMethod(){
		try{
			System.out.println("static Synchronized Method starts ==> "+Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("static Synchronized Method ends --> "+Thread.currentThread().getName());
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}


	static class MyThread1 extends Thread{
		public void run(){
			
			obj1.syncMethod(); // This method might go into block state as it is called on same object and executing synchronized method as Thread t2.
		}
	}

	static class MyThread2 extends Thread{
		public void run(){
			obj1.duplicateSyncMethod();  // This method might go into block state as it is called on same object and executing synchronized method as Thread t1.
		}
	}

	static class MyThread3 extends Thread{
		public void run(){
			MethodAccessProb.staticSyncMethod(); // This method is called using class name and may go to block state as its synchronized 
													 //	and also being executed by thread 
		}
	}

	static class MyThread4 extends Thread{
		public void run(){
			obj2.staticSyncMethod();  // This method is called using class name and may go to block state as its synchronized 
										  //	and also being executed by thread t3
		}
	}


	public static void main(String args[]){
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		MyThread4 t4 = new MyThread4();
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
			
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}