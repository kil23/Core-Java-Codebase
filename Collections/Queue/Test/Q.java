import java.util.*;

public class Q {
    static <E> List<E> heapSort(Collection<E> c) {
            Queue<E> queue = new PriorityQueue<E>(c);
            List<E> result = new ArrayList<E>();

            while (!queue.isEmpty())
            result.add(queue.remove());

            return result;
        }

    public static void main(String[] args) throws InterruptedException {
        
        int time = Integer.parseInt(args[0]);
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = time; i > 0; i--)
            queue.add(i);
        // queue.add(null);  ----> Throws NullPointerException if null element is added...
        while (!queue.isEmpty()) {
            System.out.println(heapSort(queue));
            System.out.println(queue.remove());
            Thread.sleep(1000);
        }
        System.out.println("Timeout...");

    }
}