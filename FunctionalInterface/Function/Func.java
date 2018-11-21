/*
- Function has four methods of which two are default.
 apply() --> which is used to write the operation implementation we have to do using that fucntion instance.
 compose() --> is default method that computes the func2 passed in argument first then the caller func1.
 andThen() --> is default method that computes the caller func1 first and then func2 passed in the argument.
 static identity() --> which returns the object passed to it as it is. It does nothing.
*/

import java.util.function.*;
import java.util.*;

class Func{
  public static void main(String[] args) {
    String s = "";

    Function<String, String> funcToUpper = (str) -> str.toUpperCase();
    Function<String, String> funcToConcat = str ->  str.concat(s) ;
    Function<String, String> Suraj = Function.<String, String>identity();

    List<String> initlist = Arrays.asList("a","b","c","d","e","f");
    List<String> result = functionalOperation(initlist, funcToUpper);
    List<String> res = functionalOperation(initlist, funcToUpper.andThen(funcToConcat));
    List<String> res2 = functionalOperation(initlist, funcToUpper.compose(funcToConcat));
    List<String> resId = functionalOperation(initlist, Function::identity);
    res.forEach(System.out::print);
    res2.forEach(System.out::print);
    System.out.println();
    resId.forEach(System.out::print);
  }

  public static List<String> functionalOperation(List<String> initlist, Function<String, String> funcToUpper){
    List<String> list = new ArrayList<>();
    System.out.println(initlist);
    for(String str : initlist){
      list.add(funcToUpper.apply(str));
    }
    return list;
   }
}
