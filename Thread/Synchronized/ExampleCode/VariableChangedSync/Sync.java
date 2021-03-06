class MyThread extends Thread{
	
	public static int i = 5;
	//public int j = 10;

	public void run(){
		MyThread o = new MyThread();

		if(Thread.currentThread().getName().equals("t1")){
			try{
				o.m1();
				Thread.sleep(500);
				MyThread.m2();			
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}

		if(Thread.currentThread().getName().equals("t2")){
			try{
				o.m1();
				Thread.sleep(500);
				o.m2();	
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		
		
	}

	 /*

	 This code is not synchronized properly becoz we have object lock on one method and class level lock on another method.
	 So we can make changes to static variable inside both method simultaneously.. In order to avoid this ambiguity we can 
	 make (1)synchronized method as synchronized block and take lock on same object which is static and final and declared globally
	 (2) or just surround the increment operation within a new synchronized block and call it using global object lock which is 
	 static and final and declared in global space...
	 
*/
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