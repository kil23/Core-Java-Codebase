import java.lang.*;

class arrayCheck {
	public static void main(String[] args){
		int a[] = {1,2,3,4,5};
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i] = i+1;
		}
		a=arr;
		if(a==arr){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		
		}
	}
}