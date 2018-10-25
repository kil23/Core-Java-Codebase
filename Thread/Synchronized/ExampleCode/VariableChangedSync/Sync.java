class MyThread extends Thread{
	
	public volatile static int i = 5;
	//public int j = 10;

	public void run(){
		MyThread o = new MyThread();

		if(Thread.currentThread().getName().equals("t1")){
			try{
				o.m1();
				Thread.sleep(500);
				m2();			
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}

		if(Thread.currentThread().getName().equals("t2")){
			try{
				o.m1();
				Thread.sleep(500);
				m2();	
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		
		
	}

	public synchronized void m1(){
		MyThread.i++;
		System.out.println(Thread.currentThread().getName()+" "+i);
	}

	public static synchronized void m2(){
		i++;
		System.out.println(Thread.currentThread().getName()+" "+i);
	}

}

class Sync{
	public static void main(String args[]){
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
}