/*
- DISTINCT() returns a new Stream that contains only unique objects which are identified
  using equals() method.
- FILTER() takes a Predicate and returns a stream that contain elements who passed the
  condition mentioned in the Predicate.
- SORTED() returns a new Stream which is sorted and Original stream is unchanged.
  It takes a Comparator which is used to sort the stream accordingly.
- LIMIT() to limit the number of elements passed in the stream. It takes integer value
  and limit elements from the start.
- PEEK() takes a consumer and returns a new Stream that has all elements of Original stream.
- SKIP() skips the initial n elements and return a stream with rest of the element.
*/

import java.util.stream.*;
import java.util.*;

class MapToStream{
  static class Person {
     String name;
     long id;
     int age;

     public Person(String name, long id, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
     }

     public String getName(){
       return name;
     }
     public long getId(){
       return id;
     }
     public int getAge(){
       return age;
     }
  }

  static final List<Person> persons = new ArrayList<Person>();

  static {
     persons.add(new Person("Robin", 12345, 27));
     persons.add(new Person("Reena", 109876, 22));
     persons.add(new Person("Priya", 22245, 37));
     persons.add(new Person("Nitin", 1511, 31));
  }

  public static void mapToStream(List<Person> persons) {

    // DISTINCT()
     Stream<Person> distinctPersons = persons.stream().distinct();
     System.out.println("Number of distinct users as per equals() method is " + distinctPersons.count());

    // FILTER()
     System.out.println("Users over 30 are ");
     Stream<Person> personsOver30 = persons.stream().filter(person -> person.age > 30);
     personsOver30.forEach(person -> System.out.println(person.name + " is of age " + person.age));

    // SORTED()
     System.out.println("Sorting the persons list");
     Stream<Person> sortedPersons = persons.stream().sorted(Comparator.comparing(Person::getName));
     sortedPersons.forEach(person -> System.out.println(person.getName()));
     System.out.println("The persons list unsorted ");
     persons.forEach(person -> System.out.println(person.getName()));

    // LIMIT()
     System.out.println("2 Persons in list are : ");
     Stream<Person> twoSizePersons = persons.stream().limit(2);
     twoSizePersons.forEach(person -> System.out.println(person.getName()));

    // PEEK()
     System.out.println("Person names in caps :: ");
     Stream<Person> renamedPersonsStream = persons.stream().peek(person -> person.name = person.name.toUpperCase());
     renamedPersonsStream.forEach(person -> System.out.println(person.getName()));

    // SKIP()
     System.out.println("After skipping, Persons in list are :: ");
     Stream<Person> skippedPersons = persons.stream().skip(2);
     skippedPersons.forEach(person -> System.out.println(person.getName()));
  }

  public static void main(String[] args) {
    mapToStream(persons);
  }
}
