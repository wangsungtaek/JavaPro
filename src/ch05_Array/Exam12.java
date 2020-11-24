package ch05_Array;
/*
 * 2차원 배열의 행의 합과 열의 합 구하기
 * [결과]
 * 0행의 합 : 30
 * 1행의 합 : 120
 * 2행의 합 : 300
 * 
 * 0열의 합 : 100
 * 1열의 합 : 130
 * 2열의 합 : 130
 * 3열의 합 : 90
 * 
 */
public class Exam12 {

	public static void main(String[] args) {
		
		int arr[][] = {
				{1},
				{10,20},
				{30,40,50},
				{60,70,80,90},
				{60,70,80,90,100}
		};
		int column[] = new int[5];
		int rowSum = 0;

		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "row(행)의합 : ");
			rowSum = 0;
			for(int j=0; j<arr[i].length; j++) {
				rowSum += arr[i][j];
				column[j] += arr[i][j];
			}
			System.out.print(rowSum);
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<column.length; i++) {
			System.out.println(i + "column(열)의합 : " + column[i] );
		}
	}
}

