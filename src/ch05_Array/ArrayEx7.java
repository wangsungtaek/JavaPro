package ch05_Array;

public class ArrayEx7 {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		arr[0][0] = 10;		arr[0][1] = 20;
		arr[1][0] = 30;		arr[1][1] = 40;
		arr[2][0] = 50;		arr[2][1] = 60;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("��ü����");
		int[] arr1 = { 1, 2, 3, 4, 5};
		// arr[1] �� �ڷ��� int[] 
		// arr1�� �ڷ��� int[] �ڷ���
		arr[1][0] = 122;	arr1[3] = 5000;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		for (int a : arr1) {
			System.out.print(a + ",");
		}
	}
}
