package ch05_Array;

import java.util.Scanner;
/*
 * �𷡽ð� ����
 */
public class Exam11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ȧ���� ���ڸ� �Է��ϼ���.");
		int num = scanner.nextInt();
		char[][] matrix = new char[num][num];
		
		int start = 0;
		int end = num;
		
		for(int i=0; i<=matrix.length/2; i++) {
			for(int j=0; j<matrix.length; j++) {
				if(start <= j && j < end) {
					matrix[i][j] = '*';
				}
			}
			start++; end--;
		}
		
		start = matrix.length/2;
		end = matrix.length/2;
		
		for(int i=matrix.length/2; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				if(start <= j && j <= end) {
					matrix[i][j] = '*';
				}
			}
			start--; end++;
		}
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	
	}
}

