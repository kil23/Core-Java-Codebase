import java.io.*;

class Address implements Cloneable{
 	int hNo = 34 ;
 	String sName = "Sr nagar";
 	String city = "BLR";

 	public String toString(){
 		return "hNo: "+hNo+ "\nsName: "+sName+"\ncity: "+city;
 	}

 	public Address clone() throws CloneNotSupportedException{
 		Address a = (Address) super.clone();
 		return a;
 	}

}

class Employee implements Cloneable{
	String name = "abc";
	String id = "a12";

	Address a = new Address();


	public String toString(){
		return "name: "+name+"\nid: "+id; 
	}

	public Employee clone() throws CloneNotSupportedException{
		Employee e = (Employee)super.clone();
		e.a = this.a.clone();
		return e;
	}
}

public class DeepClone{
	public static void main(String [] args)throws CloneNotSupportedException{

		Employee ob1 = new Employee();// Object created...
		
		System.out.println("---Displaying original object---");
		System.out.println(ob1);
		System.out.println("Hashcode of original object is "+ob1.hashCode());
		
		Employee ob2 = ob1.clone();// Object cloned here...
		
		System.out.println("---Displaying duplicate object---");
		System.out.println(ob2);
		System.out.println("Hashcode of duplicate object is "+ob2.hashCode());

		System.out.println(ob1.a.hashCode());
		System.out.println(ob2.a.hashCode());
	}
}