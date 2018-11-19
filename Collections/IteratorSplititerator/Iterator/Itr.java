import java.util.*;

class Itr{
  public static void main(String[] args) {
    List<String> l = new ArrayList<>();
    l.add("Alpha");
    l.add("Beta");
    l.add("Gamma");
    l.add("Delta");
    l.add("Phi");
    l.add("Omega");
    l.add("Zeta");
    System.out.println(l);
    Iterator i = l.iterator();
    while(i.hasNext()){
      System.out.println("Removing..."+i.next());
      i.remove();
    }
    System.out.println(l);
  }
}
