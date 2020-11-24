package ch04_controllProgram;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		
		for(int i=0; i<len; i++) {
			for(int j=len; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
