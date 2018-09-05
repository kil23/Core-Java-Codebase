import java.lang.*;

class Operator{
	static void arithmaticInteger(int a, int b){
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
		System.out.println("Subtrction of "+a+" from "+b+" is "+(b-a));
		System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
		System.out.println("Division of "+b+" by "+a+" is "+(b/a));
		System.out.println("Remainder when "+a+" is divided by "+b+" is "+(a%b));
		System.out.println("Negative of a is "+-a+ " and that of b is "+-b);
	}

	static void arithmaticFloat(float a, float b){
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
		System.out.println("Subtrction of "+a+" from "+b+" is "+(b-a));
		System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
		System.out.println("Division of "+b+" by "+a+" is "+(b/a));
		System.out.println("Remainder when "+a+" is divided by "+b+" is "+(a%b));
		System.out.println("Negative of a is "+-a+ " and that of b is "+-b);

	}

	static byte byteMethod(byte a, byte b){
		byte c = (byte)(a * b) ;
		return c;
	}

	public static void main(String []args){
		boolean t = true;
		boolean f = false;
		int a=5;
		int b=-3;
		byte c = 90;
		byte d = 40;
		System.out.println();
		arithmaticInteger(5,7);
		System.out.println("");
		arithmaticFloat(2.0f,7.0f);
		byte e= byteMethod(c,d);
		System.out.println(e);
		System.out.println(Integer.toBinaryString(e));
		if(t||f){
			System.out.println("logical && true");
		}else{

			System.out.println("logical && false");
		}
		if(t&f){
			System.out.println("bitwise & true");
		}else{

			System.out.println("bitwise & false");
		}
		if((a>b) & (a==5)){
			System.out.println("bitwise true");
		}
		else{
			System.out.println("bitwise false");
		}
	}
}