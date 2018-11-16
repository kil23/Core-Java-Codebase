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
- There is primitive stream as well to avoid autoboxing as DoubleStream, IntStream, LongStream.
- Stream<Double> is a stream of Double Object whereas DoubleStream is a stream of Double values.

  Classes/Interfaces      methodToCreate      CreatedStream
---------------------------------------------------------------------------------------
    Collection              stream()            Stream<E>
---------------------------------------------------------------------------------------
    Arrays               stream(T[] arr)        Stream<T>
                      =========================================
                         stream(T[] arr,        Stream<T>
                         int startInclusive,
                         int endInclusive)
---------------------------------------------------------------------------------------
   Arrays                stream(int[] arr)      IntStream
                     =========================================
                        stream(double[] arr)    DoubleStream
                     =========================================
                        stream(long[] arr)      LongStream
---------------------------------------------------------------------------------------
   Files                  lines(Path p)         Stream<String>
                     =========================================
                         lines(Path p,          Stream<String>
                            Charset cs)
---------------------------------------------------------------------------------------
   Stream                of(T... values)        Stream<T>
                     =========================================
                         of(T t)                Stream<T>
---------------------------------------------------------------------------------------
  DoubleStream         of(double... values)     DoubleStream
                     =========================================
                       of(double t)             DoubleStream
---------------------------------------------------------------------------------------
  IntStream            of(int... values)        IntStream
                     =========================================
                       of(int t)                IntStream
---------------------------------------------------------------------------------------
  LongStream           of(long... values)       LongStream
                     =========================================
                       of(long t)               LongStream
---------------------------------------------------------------------------------------

- Streams uses pipeline which can drastically improve the efficiency of data processing.
- map() is another intermediate operation that takes a Function. It doesnot winnow down the elements of stream.
  rather it transform elements of a stream. Say calculate squre of all elements in the stream or get the age
  of Person so that we can apply filter opertion on the output it generates.
- Function has apply() that takes one value and produces another value which is passed on to next operation.
- All Reductions are terminal operation as count() or reduce().
- Reduction operations are designed to combine multiple inputs into one summary result which could be a single
  number as count() produces or can be a collection of values.
- Stream's reduce() takes BiFunction(a Function whose apply() takes two arguments and produces one value) and
  applies to pairs of elements from the stream, returning a value.
- reduce() is used if you want a custom reduce function. Or you can use count(), sum(), average() for reduction.
- peek() takes a Consumer and allows you to peek into the stream as the elements flow by. It doesnot affect the stream.
*/

import java.util.*;
import java.util.stream.*;

class SD{
  public static void main(String[] args) {
    // program prints the count of number that are greater than 2 in the array.
    Integer[] in = {1,2,3,4,5};
    Stream<Integer> myStream = Arrays.stream(in);
    long intElements = myStream.filter((i)->i>2).count();
    System.out.println("Filtered stream: "+intElements);
    intElements = Arrays.stream(in)
                  .filter((i)->i<5)
                  .count();
    System.out.println("New filter stream: "+intElements);

    DoubleStream ds = DoubleStream.of(234.32, 542.7, 785.24, 565.889);
    System.out.println("DoubleStream element count: "+ds.count());

    List<String> names = Arrays.asList("Akshay", "Suraj", "Sai", "Anushree", "Abhay", "Priya", "Saurabh", "Amrutha", "Shwetha");
    names.stream()
         .filter(i->i.startsWith("A")||i.startsWith("S")) // It filters the stream according to the condition.
         .filter(s -> s.length()>5) // filtered stream is again filtered according to the condition.
         .forEach(System.out::println); // printing using method reference.

    // Map-Filter-Reduce
    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
    long res = nums.stream()
                   .map(n-> n*n)
                   .filter(n -> (n%3==0))
                   .peek(n -> System.out.println("Number/3 is: "+n))  // another intermediate method to print each number in the stream.
                   .count();
    System.out.println(res);
  }
}
