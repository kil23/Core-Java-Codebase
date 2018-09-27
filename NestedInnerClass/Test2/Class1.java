class A{
    class B{
        public void m1(){
            System.out.println("A.B running...");
        }
    }
}

class Test extends A{

    public void show(){
        
        B b5 = new B(); //Test.B Running
        b5.m1();
        
        // A.B b7 = new B(); //Error
        // b7.m1();
        
        A.B b9 = new A.B();  //A.B running
        b9.m1();
        
        // A.B b10 = new Test.B();
        
        
        
        
        
        
        
        //  Test.B b1 = new Test().new B(); // Test.B running...
        // b1.m1();
        // B b2 = new Test().new B(); // Test.B running...
        // b2.m1();
        // //A.B b3 = new Test().new B(); Test.B cannot be converted to A.B
        // //b3.m1();
        // A.B b4 = new A().new B(); // A.B running...
        // b4.m1();
        // If same name Inner class not present in child class then 
        
    }

    class B{
        public void m1(){
            System.out.println("Test.B running...");

        }

    }

    // public static void main(String args[]){
    //     Test t = new Test();
    //     t.show();
    // }    
}

public class Class1 {
   
    public static void main(String args[]){
         A a = new Test();
         A.B b = a.new B();
         
         b.m1();
         new Test().new B().m1();
         
        System.out.println(b.getClass().getName());
        System.out.println(a.getClass().getName());
        System.out.println(a);


    } 
    
}