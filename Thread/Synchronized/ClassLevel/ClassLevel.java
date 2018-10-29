import java.io.*;

class A {

	void m1(){
		try{
			System.out.println("normal m1 starts..1.."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("normal m1 ends..1.."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	synchronized void m2(){
		try{
			System.out.println("sync normal m2 starts..."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("sync normal m2 ends....."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			System.out.println();
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	synchronized static void m3(){
		try{
			System.out.println("sync static m3 starts.."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("sync static m3 ends...."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			System.out.println();
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	synchronized static void m4(){
		try{
			System.out.println("sync static m4 starts."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("sync static m4 ends..."+Thread.currentThread().getName()+" "+System.currentTimeMillis());
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
		if(Thread.currentThread().getName().equals("t3")){
			try{
				a.m1();
				Thread.sleep(500);
				A.m3();
				Thread.sleep(500);
				a.m2();
				Thread.sleep(500);
				a.m4();		// Cannot execute with t4 thread...
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
			Thread t3 = new Thread(m);
			
			t1.setName("t1");
			t2.setName("t2");
			t3.setName("t3");
			
			t1.start();
			t2.start();
			t3.start();

	}
}