import java.io.*;

class A{
	void m1(){
		try{
			System.out.println("Try block is running...");
			throw new IOException();
		}catch(IOException e){
			System.out.println("Catch block of IOException running..."+e);
		}catch(Exception e){ // This block is returned in the second place because subclasses should be declared before the parent Exception.
			System.out.println("Catch block of Exception running...");
		}
	}
}

class TryCatchMultiple{
	public static void main(String [] args){
		A a = new A();
		a.m1();
	}
}