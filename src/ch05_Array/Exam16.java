package ch05_Array;
/*
 * �𷡽ð� ����
 */
import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ȧ���� ���ڸ� �Է��ϼ���.");
		int num = scan.nextInt();
		char[][] matrix = new char[num][num];
		int start = 0;
		int end = num;
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				if(start < end) {
					if(start <= j && j < end) {
						matrix[i][j] = '*';
					} else {
						if(end <= j && j < start) {
							matrix[i][j] = '*';
						}
					}
				}
			}
			
			if(start == matrix.length/2) {
				start++; end--;
			}
			start++;
			end--;
		}
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
