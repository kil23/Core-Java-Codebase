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
    System.out.println("First split of size "+s.estimateSize());
    // System.out.println(s.hasCharacteristics(Spliterator.SORTED));
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
