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
		int a=1073741824;
		int b=-3;
		byte c = 8;
		byte d = 4;
		int l = 4;
		int m = 6;
		int g=-2147483648;
		float h = 23.75f;
		System.out.println();
		arithmaticInteger(5,7);
		System.out.println("");
		arithmaticFloat(2.0f,7.0f);
		System.out.println();
		byte e= byteMethod(c,d);
		System.out.println("Binary representation of negative number :"+Integer.toBinaryString(b));
		System.out.println("Binary representation of negative number after right shift :"+Integer.toBinaryString((b>>2)));
		System.out.println("Binary representation of negative number after left shift:"+Integer.toBinaryString((b<<4)));
		System.out.println("Binary representation of negative number after right unsigned shift:"+Integer.toBinaryString(b>>>3));
		System.out.println();
		System.out.println("Binary representation of positive number after right unsigned shift:"+Integer.toBinaryString((a>>>16)));
		System.out.println("Binary representation of positive number :"+Integer.toBinaryString(a));
		System.out.println("Decimal value of positive number after left shift:"+(a<<2));
		System.out.println("Binary representation of positive number after left shift :"+Integer.toBinaryString((a<<2)));
		System.out.println("Decimal value of positive number after left shift:"+(a<<1));
		System.out.println("Binary representation of positive number after left shift :"+Integer.toBinaryString((a<<1)));
		System.out.println();
		System.out.println("Decimal value of negative number after right shift:"+(g>>1));
		System.out.println("Binary representation of negative number after right shift :"+Integer.toBinaryString((g>>1)));
		System.out.println("Decimal value of negative number after right unsigned shift by 1:"+(g>>>1));
		System.out.println("Binary representation of negative number after right unsigned shift by 1 :"+Integer.toBinaryString((g>>>1)));
		System.out.println("Decimal value of negative number after right unsigned shift by 2:"+(g>>>2));
		System.out.println("Binary representation of negative number after right unsigned shift by 2:"+Long.toBinaryString((g>>>2)));
		System.out.println();
		System.out.println("Binary representation of Floating point number is: "+ Integer.toBinaryString(Float.floatToIntBits(h)));
		System.out.println(e);
		System.out.println(Integer.toBinaryString(e));
		System.out.println(~g );

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
/*
C:\Users\abayes\Documents\java>cd operator

C:\Users\abayes\Documents\java\operator>javac Operator.java

C:\Users\abayes\Documents\java\operator>java Operator

Addition of 5 and 7 is 12
Subtrction of 5 from 7 is 2
Multiplication of 5 and 7 is 35
Division of 7 by 5 is 1
Remainder when 5 is divided by 7 is 5
Negative of a is -5 and that of b is -7

Addition of 2.0 and 7.0 is 9.0
Subtrction of 2.0 from 7.0 is 5.0
Multiplication of 2.0 and 7.0 is 14.0
Division of 7.0 by 2.0 is 3.5
Remainder when 2.0 is divided by 7.0 is 2.0
Negative of a is -2.0 and that of b is -7.0

Binary representation of negative number :11111111111111111111111111111101
Binary representation of negative number after right shift :11111111111111111111111111111111
Binary representation of negative number after left shift:11111111111111111111111111010000
Binary representation of negative number after right unsigned shift:11111111111111111111111111111

Binary representation of positive number after right unsigned shift:100000000000000
Binary representation of positive number :1000000000000000000000000000000
Decimal value of positive number after left shift:0
Binary representation of positive number after left shift :0
Decimal value of positive number after left shift:-2147483648
Binary representation of positive number after left shift :10000000000000000000000000000000

Decimal value of negative number after right shift:-1073741824
Binary representation of negative number after right shift :11000000000000000000000000000000
Decimal value of negative number after right unsigned shift by 1:1073741824
Binary representation of negative number after right unsigned shift by 1 :1000000000000000000000000000000
Decimal value of negative number after right unsigned shift by 2:536870912
Binary representation of negative number after right unsigned shift by 2:100000000000000000000000000000

Binary representation of Floating point number is: 1000001101111100000000000000000
32
100000
2147483647
logical && true
bitwise & false
bitwise false

C:\Users\abayes\Documents\java\operator>
*/