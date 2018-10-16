
class Message{
	private String msg;

	public Message(String str){
		this.msg = str;
	}

	public String getMessage(){
		return msg;
	}

	public void setMessage(String str){
		this.msg = str;
	}
}

class Waiter implements Runnable{
	private Message msg;

	public Waiter(Message m){
		this.msg = m;
	}

	@Override
	public void run(){
		String name = Thread.currentThread().getName();

		synchronized(msg){
			try{
				System.out.println(name+ " waiting to get notified at time: "+System.currentTimeMillis());
				msg.wait();
				Thread.sleep(500);
			}catch(InterruptedException i){
				i.printStackTrace();
			}
			System.out.println(name+" thread got notified at time: "+ System.currentTimeMillis());
			System.out.println(name+" processed: "+msg.getMessage());
		}
	}	
}

class Notifier implements Runnable{
	
	private Message msg;

	public Notifier(Message m){
		this.msg = m;
	}

	public void run(){
		String name = Thread.currentThread().getName();
		System.out.println(name+ " started.");
		try{
			Thread.sleep(1000);
			synchronized(msg){
				msg.setMessage(name+" work done");
				msg.notifyAll();
			//  msg.notify();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}
}

class WaitNotify{
	public static void main(String args[]){
		
		Message msg = new Message("process it");
		Waiter w = new Waiter(msg);
		new Thread(w , "waiter 1").start();

		Waiter w1 = new Waiter(msg);
		new Thread(w1, "waiter 2").start();

		Notifier n = new Notifier(msg);
		new Thread(n, "notifier").start();

		System.out.println("All threads are started...");
	}
}