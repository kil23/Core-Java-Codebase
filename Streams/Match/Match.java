import java.util.stream.*;
import java.util.*;

class Match {

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

   public static void display(List<Person> persons) {
      Stream<Person> stream = persons.stream();
      System.out.println("The Stream instance is " + stream);
      System.out.println("No Of Elements in stream is " + stream.count());
   }

   public static void booleanChecks(List<Person> persons) {
     
  // ALLMATCH()
   boolean allAdults = persons.stream().allMatch(person -> person.age > 21);
   System.out.println("All Passed users are adults ? " + allAdults);

  // ANYMATCH
   boolean includesUsersWithNamesBeginningWithM = persons.stream().anyMatch(person -> person.name.startsWith("M"));
   System.out.println("Any users whose name begins with M ? " + includesUsersWithNamesBeginningWithM);

  // NONEMATCH
   boolean adminUser = persons.stream().noneMatch(person -> person.id == 1);
   System.out.println("Is Admin Present ? " + adminUser);
  }

   public static void main(String[] args) {
     display(persons);
     booleanChecks(persons);
   }
}
