class InstanceStaticBlock{
	{
		try{
			throw new Exception();
		}catch(Exception e){
			System.out.println(e);
		}
		if(1==1){
			throw new RuntimeException();
		}
	}

	InstanceStaticBlock() throws RuntimeException{
			System.out.println("Constructor...");
	}

	static{
		try{
			throw new Exception();
		}catch(Exception e){
			System.out.println("Static block");
		}
	}

	public static void main(String args[]){
		
			InstanceStaticBlock i = new InstanceStaticBlock();
		
		System.out.println("End of main...");
	}
}