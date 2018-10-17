import java.io.*;

class A {

	void m1()throws InterruptedException{
		try{
			System.out.println("normal m1 starts..1.."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("normal m2 ends..1.."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	synchronized void m2()throws InterruptedException{
		try{
			System.out.println("sync 22 block starts..."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("sync 22 block ends....."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			System.out.println();
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	synchronized static void m3()throws InterruptedException{
		try{
			System.out.println("sync 333 block starts.."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("sync 333 block ends...."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			System.out.println();
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	synchronized static void m4()throws InterruptedException{
		try{
			System.out.println("sync 4444 block starts."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("sync 4444 block ends..."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			System.out.println();
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}


class MyClass implements Runnable {
	A a = new A();
	public void run(){
		if(Thread.currentThread().getName().equals("t1")){
			try{
				a.m1();
				Thread.sleep(500);
				a.m2();
				Thread.sleep(500);
				A.m3();		// Cannot execute with t3 thread...
				Thread.sleep(500);
				A.m4();	
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		if(Thread.currentThread().getName().equals("t2")){
			try{
				a.m1();
				Thread.sleep(500);
				a.m2();
				Thread.sleep(500);
				A.m3();
				Thread.sleep(500);
				A.m4();		// Cannot execute with t4 thread...
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}


class ClassLevel{
	public static void main(String args[]){
		MyClass m = new MyClass();
		
			Thread t1 = new Thread(m);
			Thread t2 = new Thread(m);
			
			t1.setName("t1");
			t2.setName("t2");
			
			t1.start();
			t2.start();
			
		
		System.out.println("End of Main method...");

	}
}