import java.util.Vector;
import java.util.LinkedList;
import java.util.List;

class V{
	public static void main(String[] args){
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(5);
		v.add(8);
		v.add(3,4);
		v.add(5,6);
		v.add(6,7);
		System.out.println("Vector is " + v); 

		List<String> names = new LinkedList<>();
		names.add("Vaishnavi");
		names.add("Aisha");
		names.add("Pranav");

		Vector<String> v1 = new Vector<>();
		v1.addAll(names);
		System.out.println("Vector is "+ v1);
		System.out.println("Vector is "+ v1.capacity());
		System.out.println("Vector is "+ v1.size());
		v1.remove("Pranav");
		System.out.println("Vector is "+ v1.capacity());
		System.out.println("Vector is "+ v1.size());
		v1.trimToSize();
		System.out.println("Vector is "+ v1.capacity());

	}
}