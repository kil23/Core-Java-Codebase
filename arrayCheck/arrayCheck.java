import java.util.Collections;
import java.util.Arrays;

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
		int copy[] = new int[5];
		System.arraycopy(a,0,copy,0,5);
		for(int i=0;i<copy.length;i++){
			System.out.print(copy[i]+" ");
		}
		Integer array1[] = {1,12,5,3,6,17,15,11};
		Arrays.sort(array1);
		System.out.println("\n Sorted array: "+Arrays.toString(array1));
		Arrays.sort(array1, Collections.reverseOrder());
		System.out.println("Reverse array: "+Arrays.toString(array1));
	}
}