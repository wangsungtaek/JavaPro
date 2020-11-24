package ch04_controllProgram;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
	
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			
			sum += str.charAt(i) - 48;
		}
		System.out.println(sum);
	}

}
