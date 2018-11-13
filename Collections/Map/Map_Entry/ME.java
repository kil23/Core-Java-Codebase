import java.util.*;

class ME{
  public static void main(String[] args) {
    HashMap hm = new HashMap();

    hm.put("Zara", new Double(2323.32));
    hm.put("Mona", new Double(7654.56));
    hm.put("Zareen", new Double(983.27));
    hm.put("Daisy", new Double(6722.98));
    hm.put("Akshara", new Double(2179.10));

    Set s = hm.entrySet();

    Iterator i = s.iterator();

    while(i.hasNext()){
      Map.Entry me = (Map.Entry)i.next();
      System.out.println(me.getKey()+" "+me.getValue());
    }
    System.out.println();

    double bal = ((Double)hm.get("Zareen")).doubleValue();
    hm.put("Zareen", new Double(bal+1000));
    System.out.println("Zara's new Balance: "+hm.get("Zareen"));
  }
}
