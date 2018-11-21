/*
- Supplier has only one method named get() which is used to get data without any input.
*/

import java.util.function.*;
import java.util.*;

class Producer{
  public static void main(String[] args) {
    Supplier<String> stringObject = () -> new String("Hello");
    String str = stringObject.get();
    System.out.println(str);
  }
}
