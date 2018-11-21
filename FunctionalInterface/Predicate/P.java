/*

- boolean test(T t) --> evaluates the predicate on given argument.
- default Predicate and(Predicate other) --> ANDing of predicate.
- default Predicate negate() --> logical negation.
- default Predicate or(Predicate other) --> Oring of predicate.
- static Predicate isEqual(Object targetRef) --> tests if two argument are
                                          equal based on Object's equal().
*/

import java.util.function.Predicate;

class P{
  public static void pred(int num, Predicate<Integer> predicate){
    if(predicate.test(num)){
      System.out.println("Number: "+num);
    }
  }

  public static void main(String[] args) {
    // 1
      Predicate<Integer> p = i-> i>50;
      System.out.println(p.test(51));

    // 2
      Predicate<String> p2 = i -> i.startsWith("a");
      System.out.println(p2.test("abcd"));

    // 3
      pred(10, i->i>7);

    // 4
      Predicate<Integer> greaterThan10 = (i) -> i > 10;
      Predicate<Integer> lowerThan20 = (i) -> i < 20;

      boolean result = greaterThan10.and(lowerThan20).test(15);
      System.out.println(result);

    // 5
      boolean result2 = greaterThan10.and(lowerThan20).negate().test(15);
      System.out.println(result2);

    // 6
      boolean result3 = greaterThan10.or(lowerThan20).negate().test(15);
  }
}
