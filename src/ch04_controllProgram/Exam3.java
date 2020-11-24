package ch04_controllProgram;

import java.util.Scanner;

public class Exam3 {
/**
 * 4의 배수는 윤년
 * 4의 배수가 아니지만 400의 배수면 윤년
 * 4의 배수가 아니지만 100의 배수면 평년
 * 4의 배수가 아니고 100의 배수가 아니면 윤년
 */
	
	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if((year%4) != 0) {
			System.out.println("평년");	
		} else if(((year%400) != 0) && (year%100) == 0) {
			System.out.println("평년");
		} else {
			System.out.println("윤년");
		}
	}
}
