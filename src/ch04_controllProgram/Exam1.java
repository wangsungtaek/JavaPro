package ch04_controllProgram;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int str = scan.nextInt();
		
		if(str > 0) {
			System.out.println("양수");
		} else if(str < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
	}
}
