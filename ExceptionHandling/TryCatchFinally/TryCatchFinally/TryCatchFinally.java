import java.io.*;

class A{
	void m1(){
		try{
			System.out.println("Try block is running...");
			throw new IOException();
		}catch(IOException e){
			System.out.println("Catch block running..."+e);
		}finally{
			System.out.println("Finally block is running...");
		}
	}
}

class TryCatchFinally{
	public static void main(String [] args){
		A a = new A();
		a.m1();
	}
}