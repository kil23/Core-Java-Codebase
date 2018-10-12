import java.util.LinkedList;
import java.util.List;
import java.util.Deque;

public class LL 
{
  public static void main(String[] args) 
  {
	List<String> names = new LinkedList<>();
	names.add("Vaishnavi");
	names.add("Aisha");
	names.add("Pranav");
    // names.add(2011);
			
	System.out.println("LinkedList content: " + names);
	System.out.println("LinkedList size: " + names.size());

	Deque<Integer> d = new LinkedList<>();
	d.add(1);
	d.addFirst(1);
	d.addFirst(0);
	d.add(2);
	d.add(null);
	d.addLast(5);
	d.addLast(8);

	System.out.println("LinkedList content: " + d);
	System.out.println("LinkedList size: " + d.size());
	d.removeFirst();
	d.removeLast();
	
	System.out.println("LinkedList content: " + d);
	System.out.println("LinkedList size: " + d.size());
  }
}
