
import java.io.*;

class A{
	void m1() throws IOException{
		try{
			System.out.println("Try block is running...");
			throw new IOException("try block Exception");
		}finally{
			System.out.println("Finally block is running...");
			throw new IOException("finally block Exception");
		}
	}
}

class TryFinallyException{
	public static void main(String [] args){
		A a = new A();
		try{
			a.m1();
		}catch(IOException e){
			e.printStackTrace();
			System.out.println(e);
		}

	}
}