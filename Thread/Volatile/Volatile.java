class MyThread1 implements Runnable{
	public void run(){
		Volatile v = new Volatile();
		v.i = 8;
		v.j = 10;
		System.out.println("Value of i in thread-1: "+v.i);
		System.out.println("Value of j in thread-1: "+v.j);
	}
}

class MyThread2 implements Runnable{
	public void run(){
		Volatile v = new Volatile();
		System.out.println("Value of i in thread-2: "+v.i);
		System.out.println("Value of j in thread-2: "+v.j);
	}
}
class Volatile{
	public static volatile int i = 4;
	public int j = 5;
	
	public static void main(String args[]){
		MyThread1 r1 = new MyThread1();
		MyThread2 r2 = new MyThread2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}