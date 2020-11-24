package ch04_controllProgram;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		if('A' <= ch && 'Z' >= ch) {
			System.out.println("대문자");
		} else if('a' <= ch && 'z' >= ch) {
			System.out.println("소문자");
		} else if('0' <= ch && '9' >= ch) {
			System.out.println("숫자");
		} else {
			System.out.println("기타문자");
		}	
		
	}

}
