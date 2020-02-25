
class A{
	void m2() throws java.io.IOException{

	}

	void m1() throws java.lang.Exception{
		try(Resources r = new Resources(); 
			Resource1 r2 = new Resource1()){
			System.out.println("inside try-with-resources...");
			throw new Exception("m1 exception");
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println(10);
			throw new Exception("catch");
		}
	}
}

class Resources implements AutoCloseable{
	public void close() throws Exception{
		throw new Exception("Resources");
		//System.out.println("Resources running...");
	}
}
class Resource1 implements AutoCloseable{
	public void close() throws Exception{
		throw new Exception("Resource1");
		//System.out.println("Resource1 running...");
	}
}

class TryWithResources{
	public static void main(String [] args){
		A a = new A();
		try{
			a.m1();
			a.m2();
		}catch(Exception e){
			System.out.println(e);
			for(Throwable t : e.getSuppressed()){
			System.out.println(t);	
			}
		}
		System.out.println("Main ends here...");
	}
}