/*

GENERICS:

- Generics means Parameterized types.
- Parameterized types are important because they enable you to create classes, interfaces, and methods in which the type of data
  upon which they operate is specified as a parameter, thus making them Type-Safe.
- Also, we can create a class that automatically works with different types of data.
- Generics is useful in Collections framework to provide complete type-safety.
- RawTypes were used before Generics was introduced in Java 5.0
- In RawTypes, Object was used in order to have a parameter type that accepts all types of data.
  But while retrieving data, explicit cast are necessary in order to avoid ClassCastException which occurs at Runtime.
- Generics is Backward-compatible and RawTypes can be assigned a Generic type but a Generic type cannot be a RawType.
- Generics is useful to convert Runtime errors into Compile-time error.
- Generics is removed after successful compilation, and code is converted to normal rawtype code with effective type-cast
  and type-parameter introduced in the code. Hence no external Type-casting required. All casts are automatic and implicit.
- Generics works only with Reference Types. So when you declare an instance of generic type, Type-Argument passed to the
  type-parameter must be a reference type.Thus primitive types cannot be assigned directly as parameter-types.
  ( Also primitive types does not extends Object and after compilation all Generic types are converted to Object using Type-Erasure. )
- If primitive values are provided as parameters then those values will be autoboxed directly using respective Wrapper class.
- Thus Generics expanded your ability to reuse code and let you have tpe-safety without any type-casting with ease.

*/


class GenericBox<T,E>{ // The parameter types (T and E) needs to be passed at the time of object creation or when class is called.
   public <T,E> void boxGenericMethod(T a, E b){ // Here we are not specifying any type at Compile time but it will be resolved at
                                                 // Runtime when this method will be called. Thus we can restrict the type using Generic.
     System.out.println("This is Generic method with variable type: "+a.getClass().getSimpleName()+" and "+b.getClass().getSimpleName());
   }
}

class RawTypeBox{
  public void boxRawMethod(Object a, Object b){ // So here in order to have a generic type, we need to declare it as Object so that it can
                                                // accept any type as parameter. But we cannot restrict the type to be accepted.
    System.out.println("This is Raw method with variable type: "+a.getClass().getSimpleName()+" and "+b.getClass().getSimpleName());
  }
}

class BasicDemo{
  public static void main(String args[]){
    RawTypeBox r = new RawTypeBox(); // In Raw Type we donot specify Type-Argument.
    r.boxRawMethod("string", 12);  // Types will be infered based on the type of parameters passed in the method call.

    GenericBox<String, Integer> g = new GenericBox<>(); // Here T=String and E=Integer are Type-Argument.
    g.boxGenericMethod("abc", 3);

    GenericBox<Integer, Float> h = new GenericBox<>();
    h.boxGenericMethod(12, 20.0f);
    // h.boxGenericMethod(12, 20.0); Here we were expected to pass Float value but Double 20.0 is passed. Thus type-casting to Double
                                  // will be done implicitly and now b will be of type DOUBLE.
  }
}
