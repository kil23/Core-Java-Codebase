import java.util.*;
import java.util.function.*;

class Emp{
    private String name;
    private int empId;

    Emp(String name, int empId){
      this.name = name;
      this.empId = empId;
    }

    public String getName(){
      return name;
    }
    public int getempId(){
      return empId;
    }
}

class ExampleDemo{

  static <E>List<E> identityFunction(List<E> l, Function<E, E> func){
    List<E> list = new ArrayList<E>();
    for(E e: l){
      list.add(func.apply(e));
    }
    return list;
  }

  public static void main(String[] args) {
    List<Emp> list = new ArrayList<>();
    list.add(new Emp("AB", 5));
    list.add(new Emp("CD", 10));
    list.add(new Emp("EF", 15));
    list.add(new Emp("GH", 20));

    Function<Emp, Emp> identityFunc = Function.identity();

    List<Emp> resultantList = ExampleDemo.<Emp>identityFunction(list, identityFunc);
    for(Emp e: resultantList){
      System.out.println(e.getName() + " "+e.getempId());
    }
  }
}
