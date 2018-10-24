import java.util.*;

class HM{
	public static void main(String args[]){
		HashMap<String, Integer>h = new HashMap<>();
		h.put("Hey", 10);
		h.put("Hi", 20);
		h.put("Hello", 30);
		System.out.println(h.put("Hey", 50));

		System.out.println("Size of HashMap is "+h.size());

		print(h);

		if(h.containsKey("Hey")){
			Integer i = h.get("Hey");
			System.out.println("Hey is to be printed "+i);
		}
		h.clear();
		print(h);

	}

	public static void print(Map<String, Integer> m){
		if(m.isEmpty()){
			System.out.println("Map is Empty...");
		}
		else{
			System.out.println("Map is "+m);
		}
	}
}