class Save{
	static void show(Base b){
		System.out.println(b.getClass().getName());
	}
}

class Base{
	public void call(){
		Save.show(this);
		System.out.println(this.getClass().getName());

	}
}

class Child extends Base{
	public void call(){
		super.call();
		System.out.println(super.getClass().getName());
	}
}

class Main{
	public static void main(String [] args){
		Child c = new Child();
		c.call();
	}
}