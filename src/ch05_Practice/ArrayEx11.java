package ch05_Practice;

public class ArrayEx11 {

	public static void main(String[] args) {
		int[][] arr = new int[5][];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new int[i+1];
		}
		int count = 0;

		for(int j=arr.length-1; j>=0; j--) {
			for(int i=j; i<arr.length; i++) {
				arr[i][j] = ++count;
			}
		}
		
		for(int[] a : arr) {
			for(int b : a) {
				System.out.println(b);
			}	
		}
	}
}
