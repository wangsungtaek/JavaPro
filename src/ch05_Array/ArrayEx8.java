package ch05_Array;
/*
 *  2차원 가변형배열의 초기화
 * 
 * 
 */

public class ArrayEx8 {

	public static void main(String[] args) {

		int[][] arr = {
				{10, 20},
				{30, 40},
				{50, 60, 70}
		};
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].length+"=========");
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
