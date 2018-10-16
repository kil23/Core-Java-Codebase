class Self{
	public static void main(String args[]){
		try{
			Thread.currentThread().join(5000); // Here deadlock is created because main thread is waiting for himself to complete 
											   // but this will never happen...Its a self loop.
		}catch(InterruptedException i){
			i.printStackTrace();
		}
	}
}