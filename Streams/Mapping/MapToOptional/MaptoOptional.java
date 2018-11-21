/*
- OPTIONAL datatype states that the instance is a container that may or may not
  include any element.
- Optional is returned by findAny() and findAll() method which can return any
  occurance or all occurance of element in the stream.
- Min() Max() also takes a Comparator and returns Optional instance.
*/

import java.util.stream.*;
import java.util.*;

class MaptoOptional{
  static class Person {
     String name;
     long id;
     int age;

     public Person(String name, long id, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
     }
  }

  static final List<Person> persons = new ArrayList<Person>();

  static {
     persons.add(new Person("Robin", 12345, 27));
     persons.add(new Person("Reena", 109876, 22));
     persons.add(new Person("Priya", 22245, 37));
     persons.add(new Person("Nitin", 1511, 31));
  }

  public static void mapToOptional(List<Person> persons) {

  // FINDANY()
   Optional<Person> anyPerson = persons.stream().findAny();
   System.out.println("findAny returned " + (anyPerson.isPresent() ? anyPerson.get().name : " null "));

  // FINDFIRST()
   Optional<Person> firstPerson = persons.stream().findFirst();
   System.out.println("findFirst returned " + (firstPerson.isPresent() ? firstPerson.get().name : " null "));

   // MIN-MAX
    Optional<Person> ascPerson1 = persons.stream().min(Comparator.comparing(Person::getName));
    Optional<Person> descPerson1 = persons.stream().max(Comparator.comparing(Person::getName));
    System.out.println("first Person is " + (ascPerson1.isPresent() ? ascPerson1.get().name : " null ")
                       + " & last person is " + (descPerson1.isPresent() ? descPerson1.get().name : " null "));
  }

  public static void main(String[] args) {
    mapToOptional(persons);
  }
}
