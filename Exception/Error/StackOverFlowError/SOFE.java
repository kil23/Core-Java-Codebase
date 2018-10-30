class MyThread1 extends Thread{
	public void run(){
		try{
			Thread.sleep(3000);
			for(int i=5;i>0;i--){
				Thread.sleep(200);
				System.out.println("Thread-1 ending..."+i);	
			}
		}catch(InterruptedException e){
			System.out.println("MyThread1 run...");
		}
	}
}

class MyThread2 extends Thread{
	static int i = 0; 
	public void run(){
		try{
			i++;
			run();
		}catch(StackOverflowError e){
			System.out.println("StackOverflowError");	
		}
			System.out.println("End of Thread-2");	
	}
}

public class SOFE{
	public static void main(String args[]){
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		try{
			Thread.sleep(2000);
			System.out.println("main is ending...");	
		}catch(InterruptedException e){
			System.out.println("InterruptedException");	
		}
	}
}