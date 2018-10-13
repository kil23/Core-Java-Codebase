class A implements Runnable
{
	StringBuilder sb = new StringBuilder("");
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			sb.append("a");
		}

		System.out.println(" "+ sb.length());
	}
}

class StrBuf
{
	public static void main(String[] args)
	{
		A a = new A();
		for(int i=0;i<20;i++)
		{
			Thread t1 = new Thread(a);
			t1.start();
		}
	}
}