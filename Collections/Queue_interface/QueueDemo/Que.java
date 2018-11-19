import java.util.*;

class Que{
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    for(int i=0;i<10;i++){
      q.add(i);
    }
    System.out.println("Elements of queue: "+q);

    int r = q.remove();
    System.out.println("removed element is "+r);

    System.out.println(q);

    int h = q.peek();
    System.out.println("head of the queue is "+h);

    int s = q.size();
    System.out.println("Size of the queue: "+s);
  }
}
