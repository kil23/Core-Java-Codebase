
class Parent {
    {
        System.out.println("This is Parent Instance Initialization Block...");
    }

    Parent(){
        System.out.println("This is Parent Constructor statement...");
    }

    public void method(){
        System.out.println("This is Parent method statement...");
    }
}

class InitializationInheritanceBlock extends Parent{

    {
        System.out.println("This is Child Instance Initialization Block...");
    }

    InitializationInheritanceBlock(){
        System.out.println("This is Child Constructor statement...");
    }

    public void method(){
        System.out.println("This is Child method statement...");
    }

    public static void main(String args[]){
        InitializationInheritanceBlock i = new InitializationInheritanceBlock();
        i.method();
    }
}

/*

OUTPUT :

This is Parent Instance Initialization Block...
This is Parent Constructor statement...
This is Child Instance Initialization Block...  // super() is executed before statements of Initialization block
This is Child Constructor statement...
This is Child method statement...

 */