/*
- Stream.of() is quite flexible and works with any object values.
- Thus we can create a Stream of Strings, Integers, Doubles, etc.
- Method signature is
        *static <T> Stream<T> of(T... values)*
- We can use Stream.of() to create a stream from array of Integers as follows:
          Integer[] num = {1,2,3};
          Stream<integer> myStream = Stream.of(num);
*/

import java.util.*;
import java.util.stream.*;

class StreamOf{
  public static void main(String[] args) {

      // We can also use shorter version of what we have above as follows:

      Stream<Integer> myStream = Stream.of(1,2,3,4,5); // returns an stream object of type Integer.
      long c = myStream.filter(i -> i>3) //  Stream.of() creates a stream object directly.Hence no need for stream() method call.
                       .count();
      System.out.println(c);
  }
}
