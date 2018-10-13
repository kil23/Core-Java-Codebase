import java.io.*;

class A{
	int m1() throws IOException{
		
		try{
			throw new IOException("Akshay");
		}catch(IOException e){
			throw new IOException(e);
		}
	}
}

class C{
	public static void main(String args[]){
		A a = new A();
		try{
			int i = a.m1();
			System.out.println(i);
		}catch(Exception e){
			System.out.println(e.initCause(e));
		}
	}
}