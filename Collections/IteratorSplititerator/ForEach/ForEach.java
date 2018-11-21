/*
FOREACH:
- This is useful if you won't be modifying the contents of a collection or obtaining elements
  in reverse order.
- All the classes that implements Iterable, can be operated upon by the FOR.
- You cannot modify the contents of the collection.
- Only forward-direction iteration can happen using this.
*/

import java.util.*;

class ForEach{
  public static void main(String[] args) {

    ArrayList<Integer> vals = new ArrayList<Integer>();

    vals.add(1);
    vals.add(2);
    vals.add(3);
    vals.add(4);
    vals.add(5);
    vals.add(6);

    System.out.print("Contents of ArrayList: ");
    for(int v : vals){ // basically its nothing but --> for(Iterator i = vals.iterator(); i.hasNext(); i.next()){ }
      System.out.print(v + " ");
    }
    System.out.println();
  }
}
