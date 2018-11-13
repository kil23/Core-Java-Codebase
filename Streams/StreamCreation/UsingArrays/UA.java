import java.util.stream.*;
import java.util.*;

class UA{
  public static void main(String[] args) {
    String[] banks = {"BOI", "HDFC", "SBI", "CBI", "AXIS"}; // array creation
    Stream<String> myStream = Arrays.stream(banks); // using Arrays to create stream
    System.out.println("Total number of banks: "+myStream.count()); // directly calling count() on stream object

    System.out.println("Other way to count banks: "+Stream.of(banks).count());
  }
}
