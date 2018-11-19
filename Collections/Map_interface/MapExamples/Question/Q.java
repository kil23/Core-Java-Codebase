import java.util.*;

class Employee{
  int empid;
  String name;
  int salary;

  public Employee(int empid, String name, int salary){
    this.empid = empid;
    this.name = name;
    this.salary = salary;
  }

  int getid(){
    return empid;
  }
  String getName(){
    return name;
  }
  int getSalary(){
    return salary;
  }

  void setid(int id){
    empid = id;
  }
  void setName(String name){
    this.name = name;
  }
  void setSalary(int sal){
    salary = sal;

  }

}

class Q{
  public static void main(String[] args) {
      Map<Integer, Employee> m = new HashMap<>();
      m.put(1,new Employee(1, "AB", 500));
      m.put(2,new Employee(2, "PR", 450));
      m.put(3,new Employee(3, "ST", 600));

      List<Employee> l = new ArrayList<>(m.values());

      for(Employee e : l){
        System.out.println(e.getid()+" "+e.getName()+" "+e.getSalary());
      }

      Map<Employee, Integer> m2 = new HashMap<>();
      m2.put(new Employee(1, "AB", 500),1);
      m2.put(new Employee(2, "PR", 450),2);
      m2.put(new Employee(3, "ST", 600),3);
    
      List<Map<String, Object>> li = new ArrayList<>();
      Map<String, Object> map = new HashMap<>();
      map.put("id",1);
      map.put("Name","AB");
      map.put("Sal",500);
      li.add(map);

      Map<String, Object> map1 = new HashMap<>();
      map1.put("id",2);
      map1.put("Name","ST");
      map1.put("Sal",450);
      li.add(map1);

      Map<String, Object> map3 = new HashMap<>();
      map3.put("id",3);
      map3.put("Name","PR");
      map3.put("Sal",600);
      li.add(map3);

      System.out.print(li);

      for(int i=0; i<li.size();i++){
        Map<String, Object> mm = li.get(i);

        System.out.println(mm.get("id"));
        System.out.println(mm.get("Name"));
        System.out.println(mm.get("Sal"));

      }

  }
}
