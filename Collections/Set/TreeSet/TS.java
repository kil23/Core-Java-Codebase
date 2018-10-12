import java.util.*;

class TS{
	public static void main(String args[]){
		TreeSet t = new TreeSet();
		for(int i=0;i<=10;i++){
			t.add(i);
		}
		System.out.println(t);
		System.out.println(t.add(11));
		System.out.println(t);

		TreeSet ts = new TreeSet();
		ts.add("A");
		ts.add("B");
		ts.add("a");
		ts.add("b");
		// ts.add(1);  TreeSet cannot have Heterogeneous elements...
		// ts.add(null); TreeSet can only take null value if empty and if we add anything to it later then throw NPE
						// If the TreeSet is not empty then it will throw NPE due to comparision of null with any element.
		System.out.println(ts);

		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		System.out.println("A".compareTo("A"));


		
	}
}