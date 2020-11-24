package ch03_op;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		int num;
		System.out.println("한개의 문자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		System.out.println(num-(num%100));
		
	}
}
