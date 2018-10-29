class Demo{

	static int number = 1;
	static int max = 100;
	static Thread odd ;
	static Thread even ;
	static OddNum o = new OddNum();
	static EvenNum e = new EvenNum();

	static class OddNum implements Runnable{
		@Override
		public void run(){
			odd.setName("Odd");
			while(number<max){
				
				System.out.print(Thread.currentThread().getName() + " "+number); // print first
					
				synchronized(e){
					number++;  // increment and notify second
					e.notify();
				}
				
				synchronized(o){
					try{
						if(number<max){
							wait();  // wait third
						}
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		}
	}

	static class EvenNum implements Runnable{
	 	@Override
	 	public void run(){
	 		even.setName("Even");
			while(number<=max){
				synchronized(e){
					try{
						if(number<max){
							

							wait();  //   Wait first
						}
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				System.out.println(" "+Thread.currentThread().getName() + " "+number);  // Print second
				synchronized(o){
					number++;  // Increment and notify third
					
					o.notify();
				}
				
			}
		}
	}

	public static void main(String args[]){
		
		odd = new Thread(o);
		even = new Thread(e);		
		odd.start();
		even.start();
	}
}