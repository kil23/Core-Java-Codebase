import java.lang.*;

class stringCheck{
	static String s1 = new String("Hello");
	public static void main(String[] args){
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello"); 
		String s5 = "Hello";
		String s6 = "HelloHello";
		String s7 = s3.concat(s4);
		String s8 = new String("HelloHello");
		String s9 = s7.intern();
		if(s1==s2){
			System.out.println("s1=s2");
		}else{
			System.out.println("s1!=s2");
		}
		if(s2==s3){
			System.out.println("s2=s3");
		}else{
			System.out.println("s2!=s3");
		}
		if(s3==s4){
			System.out.println("s3=s4");
		}else{
			System.out.println("s3!=s4");
		}
		if(s2==s5){
			System.out.println("s2=s5");
		}else{
			System.out.println("s2!=s5");
		}
		System.out.println(s7);
		if(s6==s7){
			System.out.println("s6==s7");
		}else{
			System.out.println("s6!=s7");
		}
		if(s6==s9){
			System.out.println("s6==s9");
		}else{
			System.out.println("s6!=s9");
		}
		if(s8==s7){
			System.out.println("s8==s7");
		}else{
			System.out.println("s8!=s7");
		}

	}
}