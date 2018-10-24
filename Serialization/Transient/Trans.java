class Trans implements Serializable{
	void m1(){
		Transient int x ;
		int y;
		Trans(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	public int hashcode(){
		return (x^y);
	}

	public  boolean equals(Object o){
		Trans tn = (Trans)o;
		if(tn.y == x && tn.y == y){
			return true;
		else
			return false;
		}
	}

	public static void main(String args[]){
		Trans t = new Trans();
		t.m1();
	}
}