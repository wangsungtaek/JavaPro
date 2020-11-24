package ch05_Practice;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[][] arr = {
				{10, 20},
				{30, 40},
				{50, 60, 70}
		};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("i,j[" + i +"," + j + "] = " + arr[i][j] + "  //  ");
			}
			System.out.println();
		}
	}
}
