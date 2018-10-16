import java.io.*;
import java.sql.SQLException;

class A{
	void m1() throws SQLException,IOException{
		try{
			throw new IOException();
		}catch(Exception e1){
			throw e1;
		}
	}
}

class B{
	void m2() throws SQLException,IOException{
		try{
			if(true)
			throw new IOException();
			throw new SQLException();
		}catch(SQLException|IOException e){
			throw e;
		}
	}
}

public class MultiCatch{
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		try{
			a.m1();
			b.m2();
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
}