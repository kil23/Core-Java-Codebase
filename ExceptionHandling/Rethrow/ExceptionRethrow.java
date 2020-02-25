
public class ExceptionRethrow {

	public static void main(String[] args) {
		try{
			rethrow(null);
			rethrow("First");  // Rethrow function with string argument as FIRST
			
		}catch(FirstException | SecondException | ThirdException e){
			//below assignment will throw compile time exception since e is final
			//e = new Exception();
			System.out.println(e.getMessage());
		}
	}

	static void rethrow(String s) throws FirstException, SecondException, ThirdException {
		try {
			if (("First").equals(s))
				throw new FirstException("First");
			else if (s.equals("Second"))  // It is throwing NPE becoz we are comparing an object with a literal..We dont know anything about the value
										  // inside the object.. So calling equals() on null will throw NPE.. try calling it on string literal and 
										  // string object inside equals() method.. This will not throw any exception.
				throw new SecondException("Second");
			else if(s.equals("Third"))
				throw new ThirdException("Third");
		} catch (Exception e) {
			//below assignment disables the improved rethrow exception type checking feature of Java 7
			// e=new ThirdException();
			throw e;
		}
	}

	static class FirstException extends Exception {

		public FirstException(String msg) {
			super(msg);
		}
	}

	static class SecondException extends Exception {

		public SecondException(String msg) {
			super(msg);
		}
	}

	static class ThirdException extends Exception {

		public ThirdException(String msg) {
			super(msg);
		}
	}

}
