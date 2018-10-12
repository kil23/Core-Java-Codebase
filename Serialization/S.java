import java.io.*;

class E implements Serializable{
	
	public static final long serializeUid = 2314234L;
	transient int a;
	static int b;
	String name;
	int age;

	E(String name, int a, int b, int age){
		this.name = name;
		this.a = a;
		this.b = b;
		this.age = age;
	}

}
class S{

	public static void printData(E e){
		System.out.println("name = "+e.name);
		System.out.println("a = "+e.a);
		System.out.println("b = "+e.b);
		System.out.println("age = "+e.age);
		System.out.println("serializeUid = "+e.\serializeUid);
	}

	public static void main(String[] args){
		E e = new E("kil", 2, 5, 22);

		String fileName = "abc.txt";

		try{
			FileOutputStream f = new FileOutputStream(fileName);
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(e);
			o.close();
			f.close();

			System.out.println("Objects are serialized\n"+"\nData before Deserialization: ");
			printData(e);

			e.b = 8;
		}
		catch(IOException io){
			System.out.println("IOException is caught...");
		}

		e = null;

		try{

			FileInputStream fi = new FileInputStream(fileName);
			ObjectInputStream oi = new ObjectInputStream(fi);
			e = (E)oi.readObject();

			oi.close();
			fi.close();

			System.out.println("\nData after Deserialization: ");
			printData(e);

		}catch(IOException i){
			System.out.println("IOException is caught...");
		}
		catch(ClassNotFoundException c){
			System.out.println("ClassNotFoundException is caught...");
		}
	}
}