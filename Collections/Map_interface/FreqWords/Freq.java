import java.util.*;

class Freq{
	public static void main(String []args){
		Map<String, Integer> m = new HashMap<String, Integer>();
		Map<String, Integer> t = new TreeMap<String, Integer>();
		Map<String, Integer> l = new LinkedHashMap<String, Integer>();
		for(String s: args){

			Integer f = m.get(s);
			Integer g = t.get(s);
			Integer h = l.get(s);
			m.put(s, (f==null)?1:(f+1));
			t.put(s, (g==null)?1:(g+1));
			l.put(s, (h==null)?1:(h+1));
		}

		System.out.println(m.size() + " distinct words..." );
		System.out.println(t.size() + " distinct words..." );
		System.out.println(l.size() + " distinct words..." );
		System.out.println(m);
		System.out.println(t);
		System.out.println(l);
	}
}