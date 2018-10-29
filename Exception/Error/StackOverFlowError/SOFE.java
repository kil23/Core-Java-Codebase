class MyThread1 extends Thread{
	public void run(){
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("MyThread1 run...");
		}
	}
}

class MyThread2 extends Thread{
	static int i = 0; 
	public void run(){
		i++;
		run();
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
	}
}