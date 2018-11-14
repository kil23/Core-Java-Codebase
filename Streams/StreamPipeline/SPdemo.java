/*
- A stream pipeline consists of three parts: the source, zero or more intermediate operations, and a terminal operation.
- The source describes where the data is coming from; intermediate operation operate on the stream and produce another,
  perhaps modified stream; and Terminal operation ends the stream and typically produce a value or some output.
- If we have filtering intermediate operation then that input is never passed to other intermediate operation if it
  doesnot satisfy the condition of first filter.
- Using streams we can have parallel execution of operation on particular data in one cycle.
-
*/

import java.util.*;
import java.util.stream.*;

class SPdemo{
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Akshay", "Suraj", "Sai", "Anushree", "Abhay", "Priya", "Saurabh", "Amrutha", "Shwetha");

     // If we only assign intermediate operation and no terminal operation is provided then no output will be generated
     // it just prints the stram object with hashcode.
     // In order to have flow in the stream, terminal operation is required ie Streams are Lazy enough to not generate output
     // until we provide a terminal operation.

   List<String> l = names.stream()
                         .filter(i->i.startsWith("S"))
                         .collect(Collectors.toList());
   Map<String, List<String>> m = names.stream()
                                      .collect(Collectors.toMap(i->i.substring(0,2), i -> i));
       System.out.println(m);

  }
}
