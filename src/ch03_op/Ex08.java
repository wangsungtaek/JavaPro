package ch03_op;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int str = scan.nextInt();
		
		if(str >= 90) {
			System.out.println("A학점");
		} else if(str >= 80) {
			System.out.println("B학점");
		} else if(str >= 70) {
			System.out.println("C학점");
		} else if(str >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}

}
