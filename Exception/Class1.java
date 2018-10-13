class Class1
{
    public static void main(String[] args)
    {
        System.out.println("before");
        System.out.println(test());
        System.out.println("after");
    }

    static int test()
    {
        int i = 10;
        try
        {
            return i;
        }
        finally
        {
            return 5;
        }
    }
}