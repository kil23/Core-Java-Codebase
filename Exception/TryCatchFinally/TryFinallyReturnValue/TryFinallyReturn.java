class TryFinallyReturn
{
    public static void main(String[] args)
    {
        System.out.println("before");
        System.out.println(test());
        System.out.println("after");
        System.out.println(test2());
    }

    static int test()
    {
        int i = 10;
        try{
            return i;
        }finally{
            return 5;
        }
    }

    static int test2(){
        int i =20;
        try{
            return i;
        }finally{
            System.out.println(10);
        }
    }
}