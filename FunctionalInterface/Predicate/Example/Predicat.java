import java.util.function.Predicate;
import java.util.Scanner;

class User{
	String username,pass;

	User(String username, String pass){
		this.username = username;
		this.pass = pass;
	}	
}

class Predicat{
	public static void main(String[] args){

		Predicate<Integer> p = I -> I > 10; // checks if number is greater than 10 or not
		System.out.println(p.test(15));
		System.out.println(p.test(5));

		Predicate<String> p2 = s->s.length()>3 ;
		System.out.println(p2.test("abc"));
		System.out.println(p2.test("ab"));
		System.out.println(p2.test("abcd"));

		Predicate<User> p3 = u -> u.username.equals("user") && u.pass.equals("pwd");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a username: ");
		String user = sc.next();
		System.out.println("Enter password: ");
		String pwd = sc.next();
		User us = new User(user, pwd);
		if(p3.test(us)){
			System.out.println("Valid credential");
		}
		else
			System.out.println("Invalid credential");

	}
}