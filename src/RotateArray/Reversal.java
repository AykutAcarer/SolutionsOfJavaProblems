package RotateArray;

public class Reversal {

	//given array is 1,2,3,4,5,6 and order 2.
	//Divide the array two parts: 1,2,3,4 and 5, 6
	//Rotate first part: 4,3,2,1,5,6
	//Rotate second part: 4,3,2,1,6,5
	//Rotate the whole array: 5,6,1,2,3,4
	
	public static void rotate(int [] arr, int order) {
		order = order % arr.length;
		
		if(arr == null || order < 0) {
			throw new IllegalArgumentException("Illegal argument");
		}
		
		//length of first part
		int a = arr.length - order;
		
		reverse(arr, 0, a-1);
		reverse(arr, a, arr.length-1);
		reverse(arr, 0, arr.length-1);
		
		for(int b=0; b<arr.length; b++) {
			System.out.print(arr[b] + " ");
		}
		
	}
	
	public static void reverse(int [] arr, int left, int right) {
		
		if(arr == null || arr.length == 1) {
			return;
		}
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5,6};
		int order =2;
		
		rotate(arr,order);
		
		
	}

}
