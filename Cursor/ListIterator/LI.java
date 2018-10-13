import java.util.*;

class LI{
	public static void main(String args[]){
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);

		ListIterator itr = l.listIterator();
		while(itr.hasNext()){
			Integer I = (Integer)itr.next();

			if(I.equals(2)){
				itr.remove();
			}
			if(I.equals(3)){
				itr.remove();
			}
			if(I.equals(5)){
				itr.set(16);
			}
			if(I.equals(4)){
				itr.add(9);
			}
		}	
		System.out.println(l);	
	}
}