import java.util.*;

class LI{
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

    ListIterator<String> li = l.listIterator(2);
    System.out.println("Printing forward list from index 2:");
    while(li.hasNext()){
      li.add("2");
      System.out.println(li.next());
    }
    System.out.println(l);

    System.out.println("Printing reverse list:");
    while(li.hasPrevious()){
      System.out.println(li.previous());
      if(li.previous()=="2"){
        li.remove();
      }
    }
    System.out.println(l);

  }
}
