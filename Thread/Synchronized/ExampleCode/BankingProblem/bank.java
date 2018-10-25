class Account implements Runnable{
	static int withdraw = 50;
	
	public void run(){
		
		for(int i=0;i<3;i++){
			this.debit();
		}

		// System.out.println(this.balanceCheck());

	}

	public int balanceCheck(){
		return withdraw;
	}

	public synchronized void debit(){
			System.out.println("Account balance currently is "+this.balanceCheck());

		if(withdraw>0){
			System.out.println();
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			withdraw -= 10;

		//	System.out.println("Account balance currently is "+this.balanceCheck());
			//System.out.println(this.balanceCheck());
			
		}else{
			
			System.out.println("Not enough in account for "+ Thread.currentThread().getName()+ " to withdraw " +this.balanceCheck());
		}
	}

}

class bank{
	public static void main(String args[]){
		Account a = new Account();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		t1.setName("Lucy");
		t2.setName("Fred");
		t1.start();
		t2.start();
	}
}