/*
A Lambda Expression is a block of code that you can pass around so it can be executed later, once or multiple times.
A Lambda Expression is a function which can be created without belonging to any class.
A Lambda Expr thus can be passed around as if it was an object and executed on demand.
A LE consists of list of parameters, a body, a return type and a list of exceptions which can be thrown.
They are generally used to implement simple event listener/ callbacks or in functional programming.
Functional programming is very often used to implement event listener.
Event Listeners in java are often defined as Java interface with single method. This method is called 
whenever the state changes.
Interface's : 1) Return type must be same
			  2) Must have one abstract method only .(can have multiple default and static methods)
			  3) parameters of lambda expression must match parameters of single method.
Expression lambdas are single expression lambdas on the right side.
Block lambdas are lambdas with a code body (multiple statements) on the right side. 
Lambda expression does not have a state i.e. member variables.
Lambda expression reduces lines of code.
Lambda expression support Sequential and parallel execution.
We can access local variable declared outside the lambda body only if that variable is final.(not changing the value)
Lambda expr does not have its own instance variables, so 'this' always points to the enclosing object .But in the 
case of Anonymous interface, they can have  its own instance variables which are referenced using 'this'. So LE can 
capture instance variable in the object that creates the lambda. 
Lambda expr can also capture static variables as they are reachable from everywhere in Java application.
*/

interface MyNumber{
	double getValue();
}

interface I{
	boolean test(int n);
}

interface I2{
	boolean test(int n, int m);
}

interface BlockL{
	int fact(int i);
}

interface StringFunc{
	String func(String str);
}

class Lambda{ 
	
	public static void main(String []args){
		MyNumber myNum = () -> 123.45;
		System.out.println(myNum.getValue());

		I isEven = (n) -> (n%2)==0;
		if(isEven.test(10)) System.out.println("Its an even number");
		if(!isEven.test(7)) System.out.println("Its an odd number");
		
		I2 isFactor = (n,m) -> (n%m)==0;
		if(!isFactor.test(10,3)) System.out.println("3 is not factor of 10");
		if(isFactor.test(10,2)) System.out.println("2 is a factor of 10"); 
		
		BlockL fac = (n) -> {
			int res = 1;

			for(int i=1;i<=n;i++){
				res = i * res;
			}

			return res;
		};
		System.out.println("Factorial of 6: "+fac.fact(6));
		System.out.println("Factorial of 4: "+fac.fact(4));
		System.out.println("Factorial of 9: "+fac.fact(9));

		StringFunc reverse = (str) -> {
			String res = "";
			int i;

			for(i=str.length()-1;i>=0;i--){
				res += str.charAt(i);
			}
			
			return res;
		};
		System.out.println("Reverse of 'noon' is "+ reverse.func("noon"));
		System.out.println("Reverse of 'printf' is "+ reverse.func("printf"));
	}
}