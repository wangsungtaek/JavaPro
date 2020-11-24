package ch05_homework;
/*
 *  y=2*x + b	¦¢ ¦¡
 */
public class Ex1_Inclination {

	public static void main(String[] args) {
		int sizePosition = 30;
	
		char[][] arr = new char[sizePosition][sizePosition];
		int[] column_axis = new int[sizePosition/2-1];
		int[] row_axis = new int[sizePosition/2-1];

		// position
		for(int i=0; i<column_axis.length; i++) {
			column_axis[i] = 27-(i*2);
			row_axis[i] = i;
		}
		// add '/'
		for(int i=0; i<row_axis.length; i++) {
			arr[column_axis[i]][row_axis[i]] = '/';
		}
		
		// Display
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
