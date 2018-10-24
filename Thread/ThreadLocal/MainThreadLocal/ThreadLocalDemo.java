class ThreadLocalDemo{
	public static void main(String args[]){
		ThreadLocal<Number> tn = new ThreadLocal<Number>();
		ThreadLocal<String> ts = new ThreadLocal<String>();

		System.out.println(Thread.currentThread().getName()+" is working...");
		tn.set(100);
		ts.set("String");

		System.out.println("The numeric value: "+tn.get());
		System.out.println("The string value: "+ts.get());

		tn.set(90);
		ts.set("String changed");

		System.out.println("The numeric value: "+tn.get());
		System.out.println("The string value: "+ts.get());

		ThreadLocal<Integer> ti = new ThreadLocal<>();
		ThreadLocal<Float> tf = new ThreadLocal<>();
		ThreadLocal<Double> td = new ThreadLocal<>();

		ti.set(80);
		tf.set(20.1f);
		td.set(20.7);

		System.out.println("The numeric value: "+ti.get());
		System.out.println("The numeric value: "+tf.get());
		System.out.println("The numeric value: "+td.get());

		ti.remove();
		tf.remove();
		td.remove();

		System.out.println("The numeric value: "+ti.get());
		System.out.println("The numeric value: "+tf.get());
		System.out.println("The numeric value: "+td.get());
		

		ThreadLocal<Object> td1 = new ThreadLocal<>();

		td1.set(new Object());

		System.out.println("The numeric value: "+td1.get());
		System.out.println("The numeric value: "+td1.get());
		

	}
}