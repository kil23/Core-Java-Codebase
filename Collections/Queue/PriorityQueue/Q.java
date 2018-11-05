/*

PRIORITY-QUEUE
- It is used when Objects are supposed to be processed based on the priority.
- PQ extends AbstractQueue and implements Queue interface.
- The elements are ordered according to their Comparable natural ordering or by a Comparator provided at the time of
  queue construction, depending on the type of constuctor is used.
- It has 7 types of Constructors 1) PQ()  --> default comparator will order the queue in ascending order i.e smallest value first.
								 2) PQ(int capacity)  --> PQ with this capacity with default Comparator.
								 3) PQ(Comparator<? super E> comp) --> Comparator with different ordering scheme
								 4) PQ(SortedSet<? extends E> c) --> PQ created with elements present in the sorted set with same ordering scheme.
  								 5) PQ(int capacity, Comparator<? super E> comp)  --> with capacity and Comparator ordering scheme.
  								 6) PQ(Collection<? extends E> c)  --> Ordering will be natural for non-Sorted set type collection
  								 7) PQ(PQ<? extends E> c) --> Creates PQ with elements same ordering scheme as in the PQ provided.
- Although you can iterate through a PQ using an iterator, the order of that iteration is undefined. To properly use a PQ, you must
  call methods such as Offer() and poll() which are defined by the Queue interface or use Arrays.sort(pq.toArray()).
- PQ doesnot permit null pointers.
- A PQ relying on natural ordering also does not permit insertion of non-comparable objects(doing so may result in ClassCastException).
- PriorityQueue are unbounded queues but has an internal capacity governing  the size of an array used to store elements on the queue.
  It is always atleast as large as the size of the queue. As elements are added to the queue, its capacity grows automatically.
- The head is the least element w.r.t the specified ordering. If multiple elements are tied for least value, the head is one of those 
  elements -- ties are broken arbitrarily.
- The queue retrieval operations poll(), remove(), peek() and element() access the element at the head of the queue.
- This implementation is not synchronized. Multiple threads should not access a PQ instance concurrently if any of the thread modifies
  the queue. Instead use thread-safe java.util.concurrent.PriorityBlockingQueue class.
- O(log n) --> offer(), poll(), remove(), add()
  O(n) --> remove(Object), contains(Object)
  O(1) --> peek(), element(), size()

*/

import java.util.*;

class Q{
	public static void main(String args[]){
		PriorityQueue<String> pq = new PriorityQueue<String>();

		pq.add("C"); 
        pq.add("C++"); 
        pq.add("Java"); 
        pq.add("Python"); 

        System.out.println("Head value using peek function:" + pq.peek()); 

        System.out.println("The queue elements:"); // printing all elements
        Iterator itr = pq.iterator(); 
        while (itr.hasNext()) 
            System.out.println(itr.next()); 

        pq.poll(); // Removing the head and then printing the queue.
        System.out.println("After removing an element with poll function:"); 
        Iterator<String> itr2 = pq.iterator(); 
        while (itr2.hasNext()) 
            System.out.println(itr2.next()); 

        pq.remove("Java");  // removing Java using remove() method and then printing.
        System.out.println("after removing Java with remove function:"); 
        Iterator<String> itr3 = pq.iterator(); 
        while (itr3.hasNext()) 
            System.out.println(itr3.next()); 


        boolean b = pq.contains("C"); // Check if an element is present using contains() 
        System.out.println ( "Priority queue contains C or not?: " + b); 
  
        
        Object[] arr = pq.toArray(); // Getting objects from the queue using toArray() in an array and print the array  
        System.out.println ( "Value in array: "); 
        for (int i = 0; i<arr.length; i++) 
          System.out.println ( "Value: " + arr[i].toString()) ; 
	}
}