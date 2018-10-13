// Annotations are used to provide meta data for your Java code. They usually dont directly affect the execution of your code.
/*
Annotations are used to provide  :- 1) Compiler instructions
									2) Build-time instructions
									3) Runtime instructions
Java Annotations can be used at build-time where we do - generate src code, compile src, generating XML files, packaging 
compiled code and files into JAR file, etc;

Build tools like Apache Ant/ Maven can scan your Java code for specific annotations and generate src code based on those annotations.

Normally, Java Annotations are not present in your Java code after compilation.But we can define our own annotations that are 
available at runtime. These are accessed via *Java Reflection*.

You can place Annotation above classes, interfaces, method, local variables, fields and method parameters.

There are few Built-in Java Annotations: 
	- @Deprecated   (It means that below code should no longer be used. If your code uses Deprecated code then warning will be flashed.)
	- @Override  	(Its used to tell complier that the below method is overriding methods in a superclass. Its optional to write.
					 In case anyone change the name of overriden method, Compiler will tell you using @Override method that the method
					 is not overriding any method in the superclass. )
	- @SuppressWarnings (It makes the compiler suppress warnings for a given method. Its used when we need to suppress any warnings 
						 which might get generated when we make insecure type-cast, when method calls decrecated method,etc)
	- @Inherited (Its used to inherit annotations that are applied to the parent class and inherited when child class extends parent)
	- @Documented (Its used to signal JavaDoc tool that your custom annotation should be visible in the JavaDoc for classes using 
				   custom annotations.) 
*/

@interface NewAnnotation{
	String abc();
	String def();
}

@interface AnotherAnnotaion{
	String value();
}

@interface InsertNewAnnotation{
	String value();
}

class Superclass{
	public void doSomething(){
		System.out.println("Superclass method");
	}
}

class Annotation extends Superclass{

	private String str = "Welcome";

	@Override
	public void doSomething(){
		System.out.println("Overriding Superclass method");
	}

	@Deprecated
	public String getAnnotaions(){
		return this.str;
	}

	public void setAnnotations(String str){
		this.str = str;
	}

	@NewAnnotation(abc = "Hi" , def = "Hey")

	@AnotherAnnotaion(value="Hello")

	@InsertNewAnnotation("ok")
	public static void main(String [] args){
		Annotation a = new Annotation();
		a.doSomething();
	}	
}