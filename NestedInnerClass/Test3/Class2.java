class A{
    class B{
        public void m1(){

            System.out.println("A.B running...");
        }
    }
}

class Test extends A{

   public void show(){
    A.B b = new A.B();
    b.m1();
   // B.m1();
   // m1();
   }
    class B{
        public void m1(){
            System.out.println("Test.B running...");
        }
    }
}

public class Class2 {
   
    public static void main(String args[]){
        // A a = new Test();
        // A.B b = a.new B();
        // b.m1();

         Test t = new Test();
         t.show();

    } 
    
}