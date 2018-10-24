class Demo{

	static int number = 1;
	static int max = 100;
	static Thread odd ;
	static Thread even ;

	static class OddNum extends Thread{
		@Override
		public void run(){
			odd.setName("Odd");
			while(number<max){
				
				System.out.print(Thread.currentThread().getName() + " "+number); // print first
					
				synchronized(even){
					number++;  // increment and notify second
					
					even.notify();
				}
				
				synchronized(odd){
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

	static class EvenNum extends Thread{
	 	@Override
	 	public void run(){
	 		even.setName("Even");
			while(number<=max){
				synchronized(even){
					try{
						if(number<max){
							wait();  //   Wait first
						}
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				System.out.println(" "+Thread.currentThread().getName() + " "+number);  // Print second
				synchronized(odd){
					number++;  // Increment and notify third
					
					odd.notify();
				}
				
					
				
			}
		}
	}

	public static void main(String args[]){
		odd = new OddNum();
		even = new EvenNum();		
		odd.start();
		even.start();
	}
}