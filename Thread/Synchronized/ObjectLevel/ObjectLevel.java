import java.io.*;

class A {
	void m1() {
		try{
			System.out.println("m1 method of class A.1."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(500);
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	void m2(){
		try{
			System.out.println("m2 method of class A.2."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(500);
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	synchronized void m3(){
		try{
			System.out.println("sync method m3 starts.3."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("sync method m3 endsss.3."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	synchronized void m4(){
		try{
			System.out.println("sync method m4 starts..4.."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("sync method m4 endsss..4.."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}

class MyClass implements Runnable {
	A a = new A();
	A b = new A();
	public void run(){
		
		if(Thread.currentThread().getName().equals("t1")){
			try{
				a.m1();
				Thread.sleep(500);
				a.m2();
				Thread.sleep(500);
				a.m3();		// Cannot execute with t3 thread...
				Thread.sleep(500);
				a.m4();	
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		if(Thread.currentThread().getName().equals("t2")){
			try{
				b.m1();
				Thread.sleep(500);
				b.m2();
				Thread.sleep(500);
				b.m3();
				Thread.sleep(500);
				b.m4();		// Cannot execute with t4 thread...
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		if(Thread.currentThread().getName().equals("t3")){
			try{
				a.m1();
				Thread.sleep(500);
				b.m2();
				Thread.sleep(500);
				a.m3();
				Thread.sleep(500);
				b.m4();
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}

class ObjectLevel{
	public static void main(String args[]){
		MyClass m = new MyClass();
		
			Thread t1 = new Thread(m);
			Thread t2 = new Thread(m);
			Thread t3 = new Thread(m);
			t1.setName("t1");
			t2.setName("t2");
			t3.setName("t3");
			t1.start();
			t2.start();
			t3.start();
		
		System.out.println("End of Main method...");

	}
}