import java.util.*;

class LHM{
	public static void main(String[] args){
		LinkedHashMap<String, Integer> l = new LinkedHashMap<>();
		l.put("Hi", 2);
		l.put("Hey",3);
		l.put("Hello",5);

		System.out.println("Size of map is "+l.size());

		print(l);

		for(KeyType key : l.keySet()){
			System.out.println(key);
		}

		print(l);
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