class Com implements Runnable{
	static Thread t1;
	public void run(){
		System.out.println("run method..."+Thread.currentThread().getPriority());
		try
        {
            Thread.sleep(100);
        }
        catch( InterruptedException e )
        {
            System.out.println("sleep interrupted");
        }
		t1.interrupt();
	}

	public static void main(String args[]){
		Thread.currentThread().setName("t1");
		t1 = Thread.currentThread();
		Com c = new Com();
		Thread t2 = new Thread(c);
		t2.setName("t2");
		t2.setPriority(2);
		t2.start();
		try
        {
            t2.join();
            if(Thread.interrupted()){
            	System.out.println("Child thread interrupted main!");
            }
        }
        catch( InterruptedException e )
        {
            System.out.println("Child please!");
        }
        System.out.println("ALL DONE!");
	}
}