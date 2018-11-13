/*
- stream() method signature is:
    default Stream<E> stream()
- stream() returns an object of type Stream, with a generic object type parameter, meaning the stream is a stream of any object type.
*/
import java.util.*;
import java.util.stream.*;

class UsingCollection{
  public static void main(String[] args) {

    List<Double> li = Arrays.asList(123.6, 118.0, 113.0, 112.4, 115.8, 117.0, 110.2, 110.1, 106.2, 101.1);
    System.out.println("Number of days over 112 in 10 days period: "+
    li.stream() // this stream() is a default method of Collection interface and so is inherited by all classes that implements Collections.
      .filter(t->t>112.0)
      .count());

    // Note that Map is not a collection inheriting from Collection. If you want to stream a Map, you must first use the entrySet() method
    // to turn the Map into a Set, which is a Collection type.

    Map<String, Integer> myMap = new HashMap<>();
    myMap.put("BOI", 6);
    myMap.put("BOM", 4);
    myMap.put("SBI", 9);
    myMap.put("BOB", 5);
    myMap.put("IDBI", 7);
    myMap.put("AXIS", 10);
    myMap.put("HDFC", 8);

    long i = myMap.entrySet() // we first called entrySet which returns a Set and then called stream() on that Set.
                     .stream()
                     .filter(d -> d.getValue()>6) // we passed Map.Entry object as argument to Predicate lambda.
                     .count();
    System.out.println("Number of banks above the rating 6 is "+i);
  }
}
