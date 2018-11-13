/*
STREAMS:
- They are actually used for processing data efficiently.
- They are related to collections and lambdas in order to process data.
- A Stream is a sequence of elements that can be processed with operations.
- If we do Arrays.stream() then we created stream from an array. That stream can be of Integer, Float or any datatype.
- Streams are not data structure to organize data like a List is or an array is; rather Stream is a way to operate on
  data that's flowing from an array through the stream.
- count() returns the count of elements in the stream and its a terminal operation, after which stream's been turned
  into one number by the operation. i.e stream ended.
- There are terminal operations as well which can be used in between the source and the end of the stream.
- By specifying multiple operations on a stream, you are essentially defining the set of operations you want to do in
  a particular order to the data in the source.
- filter() is an intermediate operation which takes Predicate. Predicate is an interface with one abstract method
  set() that takes a value and returns a boolean.
- Thus you can have multiple intermediate operations between the source and the end of the stream but ypu can only have
  one terminal operation which produces a single number from a stream of data.
- Streams can be used only once. As soon as terminal operation is done, stream ends and cannot be reused.
- Streams are light-weight objects, so you can create multiple streams if you need to.
- A mystream is an object that gets its data from the source, but it doesnot store any data itself.
*/

import java.util.*;
import java.util.stream.*;

class SD{
  public static void main(String[] args) {
    // program prints the count of number that are greater than 2 in the array. 
    Integer[] in = {1,2,3,4,5};
    Stream<Integer> myStream = Arrays.stream(in);
    long intElements = myStream.filter((i)->i>2).count();
    System.out.println(intElements);
    intElements = Arrays.stream(in)
                  .filter((i)->i<5)
                  .count();
    System.out.println(intElements);
  }
}
