
import java.io.*;

class A{
	void m1() throws IOException{
		try{
			System.out.println("Try block is running...");
			throw new IOException("try block Exception");
		}catch(IOException e){
			System.out.println("Catch block running..."+e);
			throw new IOException("catch block Exception");
		}finally{
			System.out.println("Finally block is running...");
			throw new IOException("finally block Exception");
		}
	}
}

class TryCatchFinallyException{
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