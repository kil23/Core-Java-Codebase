class StaticInitializationBlock{

    static int i;
    int j = 15;
    static{
        i = 10;
        System.out.println("This is static initialization block statement...");
    }

    {
        System.out.println("This is instance initialization block statement..."+ j);
    }

    StaticInitializationBlock(){
        j = 20;
        System.out.println("This is Constructor statement...");
    }

    public static void main(String args[]){
        StaticInitializationBlock obj = new StaticInitializationBlock();
        System.out.println(StaticInitializationBlock.i);
        System.out.println(obj.j);
    }
}