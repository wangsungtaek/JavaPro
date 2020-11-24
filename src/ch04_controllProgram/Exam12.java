package ch04_controllProgram;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		int bottom = len*2-1;
		int center = bottom/2;
				
		for(int i=0; i<len; i++) {
			for(int j=0; j<bottom; j++) {
				if( j >= center-i && j <= center+i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		//	System.out.print((center-i)+","+(center+i));
			System.out.println();
		}
	}
}
