package ch05_Array;
/*
 *  2���� �������迭�� �ʱ�ȭ
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
