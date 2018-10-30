class MyThread1 extends Thread{
	public void run(){
		int i=0,j=0,k=0;
		String a = new String("abc");
		String s= "";
		for(k=0;k<1000;k++){
		try{
			for(i=0;i<10000000;i++){
				s+=a;
			}
		}catch(OutOfMemoryError e){
			System.out.println(a.length());
			System.out.println(i);
			System.out.println("OutOfMemoryError");
		}
		System.out.println(new String("dsfdsgf"));
			try{
			for(j=0;j<10000000;j++){
				s+=a;
			}
		}catch(OutOfMemoryError e){
			System.out.println(a.length());
			System.out.println(j);
			System.out.println("OutOfMemoryError1111111111");
		}
			System.out.println("End of thread-1");
		}
			System.out.println(k);
	}
}

class OutofMemory{
	public static void main(String args[]){
		MyThread1 t1 = new MyThread1();

		t1.start();
		try{
		t1.join();
		}catch(InterruptedException e){}
		System.out.println("End of main");

	}
}