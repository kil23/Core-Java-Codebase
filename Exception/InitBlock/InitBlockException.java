import java.io.*;

class InitBlockException{
	{ 	// This throws an error saying InitBlock must end normally and does not throw anything.
		// throw new NullPointerException();
	}
	public InitBlockException() throws Exception{
		System.out.println(10);
		throw new Exception();
		}

	void m1(){
		String s = null;
		String str = "Str";
		String ss = s.concat(str);
		System.out.println(ss);
	}
	
	public static void main(String args[]){
		try{
			InitBlockException a = new InitBlockException();
			a.m1();
		}catch(Exception e){
			
		}
	}
}