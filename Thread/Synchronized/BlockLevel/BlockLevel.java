import java.io.*;

class A {

	 void m2()throws InterruptedException{
		try{
			System.out.println(Thread.currentThread().getName()+" came");

			synchronized(this){
				System.out.println("sync obj block starts..."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
				Thread.sleep(1000);
				System.out.println("sync obj block ends....."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			}
			System.out.println();
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	 static void m3()throws InterruptedException{
		try{
			System.out.println(Thread.currentThread().getName()+" came");

			synchronized(A.class){
				System.out.println("sync class m3 block starts.."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
				Thread.sleep(1000);
				A.m4();
				System.out.println("sync class m3 block ends...."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			}
			System.out.println();
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	static void m4()throws InterruptedException{
		try{
			synchronized(A.class){
				System.out.println("sync class m4 block starts.."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
				Thread.sleep(1000);
				System.out.println("sync class m4 block ends...."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			}
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
				a.m2();
				Thread.sleep(500);
				A.m3(); // Cannot execute with t4 thread...
				Thread.sleep(500);
				A.m4();	
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}


class BlockLevel{
	public static void main(String args[]){
		MyClass m = new MyClass();
		
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();

		//System.out.println("End of Main method...");
	}
}