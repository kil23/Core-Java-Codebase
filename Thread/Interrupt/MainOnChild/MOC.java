class MOC implements Runnable{
	static Thread t1;
	
    public void run(){
        int count =0;
		System.out.println("run method..."+Thread.currentThread().getPriority());
        for(int i =0;i<1000000;i++){
            count++;
            
        }
            System.out.println(count);
            try
            {
                Thread.sleep(1000);
            }
            catch( InterruptedException e )
            {
                System.out.println("sleep interrupted "+Thread.currentThread().getName());
            }
	}

	public static void main(String args[]){
		Thread.currentThread().setName("t1");
		t1 = Thread.currentThread();
		MOC c = new MOC();
		Thread t2 = new Thread(c);
		t2.setName("t2");
		t2.setPriority(7);
		t2.start();
        int num = 0;
        for(int i =0;i<1000;i++){
            num++;
        }
        try
        {
            Thread.sleep(100);
        }
        catch( InterruptedException e )
        {
            System.out.println("sleep interrupted");
        }
		t2.interrupt();
        System.out.println("ALL DONE!");
	}
}