/*
WeakHashMap:
- It is type of Collection which has a weak reference with its entry set.
- If gc runs and the key object does not have reference then it will be garbage collected
  and entries will be deleted in the collection as well.
- In the case of HashMap, even if the key object is made null, the entries inside the
  HashMap will not be affected and later, these can be iterated and printed as well.
- Note: " objects will be garbage collected (GCed) when they are no longer have a strong
            reference from any other part of the program."
*/
import java.util.*;

class WHM{
  public static void main(String[] args) {

    HashMap h = new HashMap();
    String s1 = new String("Hello");
    String s2 = new String("World");
    h.put(s1, "Hello");
    h.put(s2, "World");

    s1 = null; // In HashMap even if we make reference as null will not affect
    s2 = null; // original hashMap entries and will print whole HashMap.
    System.gc();
    Iterator s = h.entrySet().iterator();
    while(s.hasNext()){
      Map.Entry m = (Map.Entry)s.next();
      System.out.println(m.getKey());
    }

    WeakHashMap h1 = new WeakHashMap();
    String s3 = new String("Hello1");
    String s4 = new String("World1");
    h1.put(s3, "Hello");
    h1.put(s4, "World");

    s3 = null; // Making object null will remove the reference of that object
    s4 = null; // in the WeakHashMap and thus h1 will become empty as gc() runs.
    System.gc();
    Iterator i = h1.entrySet().iterator();
    while(i.hasNext()){
      Map.Entry m1 = (Map.Entry)i.next();
      System.out.println(m1.getKey());
    }
  }
}
