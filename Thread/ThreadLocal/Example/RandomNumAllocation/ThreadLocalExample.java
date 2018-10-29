class ThreadLocalExample{
	public static class MyRun implements Runnable{
		private ThreadLocal<Integer> ti = new ThreadLocal<Integer>();

		@Override
		public void run(){
			ti.set((int)(Math.random()*50D));

			try{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" "+ti);
				m1();
			}catch(InterruptedException e){		}

			//System.out.println(Thread.currentThread().getName()+" "+ti.get());
		}

		public void m1(){
			System.out.println("m1 method running...");
			System.out.println(Thread.currentThread().getName()+" "+ti);
		}
	}

	public static void main(String args[]){
		Thread t1 = new Thread(new MyRun());
		Thread t2 = new Thread(new MyRun());
		t1.start();
		t2.start();	
	}
}