class A{
    class B{
        public void m1(){
            System.out.println("A.B running...");
        }
    }
}

class Test extends A{

   
}

public class Class2 {
   
    public static void main(String args[]){
         A a = new Test();
         A.B b = a.new B();
         b.m1();

    } 
    
}