package RotateArray;

public class BubbleRotate {

	public static void rotate(int[] arr, int order) {
		
		if(arr==null || order < 0) {
			throw new IllegalArgumentException("illegal argument!");
		}
		
		for(int i =0; i < order; i++) {
			for(int j = arr.length-1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
		
		for(int a=0; a<arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5,6,7};
		int order =3;
		
		rotate(arr,order);
		
	}

}
