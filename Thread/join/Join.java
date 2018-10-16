class MyThread implements Runnable {
	Thread t;
	@Override
	public void run(){
		try{
			
			if(Thread.currentThread().getName().equals("Suraj")){
				t = Thread.currentThread();
				Thread.sleep(2000);
				System.out.println(t.getName());
			}
			if(Thread.currentThread().getName().equals("Sai")){
				System.out.println("Waiting for other thread to complete execution...");
				t.join();
			}
			System.out.println("Runnable run method calling..."+Thread.currentThread());
		}catch(InterruptedException i){
			System.out.println(i);
		}
	}
}

class Join{
	public static void main(String args[]) {
		Runnable r = new MyThread();
		Thread t1 = new Thread(r);
		t1.setName("Suraj");
		t1.start();
		Thread t2 = new Thread(r);
		t2.setName("Sai");
		t2.start();
		System.out.println("End of main...");
	}
}