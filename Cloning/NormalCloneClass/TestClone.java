import java.util.*;

class Employee implements Cloneable{
	String name,id;

	Employee(String name, String id){
		this.name = name;
		this.id = id;
	}

	public String toString(){
		return "name: "+name+"\nid: "+id; 
	}

	public Employee clone() throws CloneNotSupportedException{
		return (Employee)super.clone();
	}
}

public class TestClone {
	public static void main(String [] args)throws CloneNotSupportedException{

		Scanner s = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		String name = s.nextLine();
		System.out.println("Enter employee id: ");
		String id = s.nextLine();
		Employee ob1 = new Employee( name, id);
		System.out.println("---Displaying original object---");
		System.out.println(ob1);
		System.out.println("Hashcode of original object is "+ob1.hashCode());
		Employee ob2 = ob1.clone();
		System.out.println("---Displaying duplicate object---");
		System.out.println(ob2);
		System.out.println("Hashcode of duplicate object is "+ob2.hashCode());
		s.close();
	}
}