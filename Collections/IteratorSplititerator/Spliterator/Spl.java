/*
SPLITERATOR:
- It works the same way as an Iterator or ListIterator.
- Importantly it has ability to provide support for parallel iteration of portions of the sequence.
- It can also be used for sequencial iteration.
- tryAdvance(Consumer c) --> it offers a streamlined approach that combines next() and hasNext()
  operation into one method. It returns false when no next element is present.
- forEachRemaining(Consumer action) --> useful when you want to apply same action to each element
  in sequenece. You use this method when you want to perform some action on each element
  collectively, rather than one at a time. This method applies action to each unprocessed element and
  then returns. It eliminates the need to provide a loop to cycle through the elements one at a time.
- trySplit() --> it doesnot take any argument. It is used to split the collection in multiple
  iterators for parallel stream. It returns a new Spliterator instance that points to the origin
  of the collection and the original spliterator points to the later half of the collection.
  If it is not possible to split the invoking Spliterator, null is returned.
- hasCharacteristics(int val) --> It returns true if the invoking spliterator has Characteristics
  passed in val. Returns false otherwise.
- characteristics() --> it returns the characteristics of the involing spliterator, encoded in int.
  They can be SORTED, DISTINCT, SIZED, IMMUTABLE.
*/

import java.util.*;

class Spl{
  public static void main(String[] args) {
    List<String> l = new ArrayList<>();
    l.add("Alpha");
    l.add("Beta");
    l.add("Gamma");
    l.add("Delta");
    l.add("Phi");
    l.add("Omega");
    l.add("Zeta");

    System.out.println("List contents: ");
    Spliterator<String> s = l.spliterator();
    Spliterator<String> s2 = s.trySplit();
    System.out.println("First split of size "+s.estimateSize()); // returns size of spliterator
    // System.out.println(s.hasCharacteristics(Spliterator.SORTED)); returns true
    while(s.tryAdvance(System.out::println));
    
    if(s2 != null){
      System.out.println("Output from other split of size "+ s2.estimateSize());
      s2.forEachRemaining(System.out::println);
    }

    List<Integer> li = new ArrayList<>();
    li.add(2);
    li.add(4);
    li.add(6);
    li.add(8);
    li.add(9);

    ArrayList<Double> ad = new ArrayList<>();
    Spliterator<Integer> si = li.spliterator();
    while(si.tryAdvance((n)-> ad.add(Math.sqrt(n))));

    Spliterator<Double> sd= ad.spliterator();
    sd.forEachRemaining(System.out::println);
  }
}
