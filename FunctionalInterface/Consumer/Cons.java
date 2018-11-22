/*
- Consumer has two method :
  apply() --> which consumes the data by performing some operation.
  andThen() --> which is used to combine two consumer operation one after other.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Cons{
  public static void main(String[] args) {

    Consumer<Integer> consumer = i ->;
    Consumer<Integer> consumerWithandThen = consumer.andThen(i -> System.out.println("(printed "+i+")"));
    List<Integer> integerList = Arrays.asList(
    new Integer(1), new Integer(10), new Integer(200),
    new Integer(101), new Integer(-10),new Integer(0));
    printList(integerList, consumer);
    System.out.println();
    printList(integerList, consumerWithandThen);
    System.out.println();

    ArrayList<Integer> vals = new ArrayList<Integer>();
    vals.add(1);
    vals.add(2);
    vals.add(3);
    vals.add(4);
    vals.add(5);
    vals.add(6);

    Consumer<Integer> forEachConsumer = i -> System.out.print(i+" ");
    System.out.println("Contents of ArrayList: ");
    vals.forEach(forEachConsumer);
  }

  public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer){
    for(Integer integer:listOfIntegers){
      consumer.accept(integer);
    }
  }
}
