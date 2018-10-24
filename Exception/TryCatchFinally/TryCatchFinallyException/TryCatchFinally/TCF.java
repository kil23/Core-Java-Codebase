import java.io.*;

class TCF{

	int m1() throws Exception{
		try{
			throw new Exception("7");
		}
		catch(Exception e){
			System.out.println(e);
			throw new Exception("12");
		}finally{
			return 5;
		}
	}

	int m2() throws Exception{
		try{
			throw new Exception("20");
		}
		finally{
			System.out.println(12);
		}
	}	

	void m3(){
			System.out.println(27);

		return;
	}

	public static void main(String args[])throws Exception{
		TCF tcf = new TCF();
		tcf.m3();
		try{
			System.out.println(tcf.m2());
		}catch(Exception e){
			System.out.println(e);

			System.out.println(tcf.m1());
			System.out.println(e.getSuppressed().length);
			
		}
	}
}