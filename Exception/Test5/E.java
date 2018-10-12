import java.io.*;

class A{
	void m1() throws IOExcetion{
		try{
			throw new IOExcetion();
		}catch(IOExcetion e1){
			throw new Exception(e);
		}
	}
}

class E{
	public static void main(String[] args){
		A a = new A();
		try{
			a.m1();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}