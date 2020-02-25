class CustomError extends Error{
	public void m1(){
		System.out.println("m2 inside CustomError...");
	}
}

public class ErrorDemo{

	public ErrorDemo(){
		super();
	}

	public void demo() throws CustomError{
		CustomError c = new CustomError();
		c.m1();
		throw new OutOfMemoryError();
		//throw new CustomError();
	}

	public static void main(String args[]){
		ErrorDemo ed = new ErrorDemo();
		try{
			ed.demo();
		}catch(OutOfMemoryError o){
			System.out.println("OutOfMemoryError can be catched...");
		}catch(CustomError c){
			System.out.println("CustomError can be catched...");
		}
		for(int i=5;i>0;i--){
			System.out.println("main is ending in ..."+i);
		}
		System.out.println("main is ending...");
	}
}