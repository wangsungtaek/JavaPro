package ch03_op;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch = str.charAt(0);
		
		
		if(96<ch && 123>ch) {
			System.out.println(ch -= 32);
		} else {
			System.out.println("소문자아님");
		}
	}

}
