package ch03_op;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		System.out.println("계산할 초를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int h = 12345 / 3600 ;
		int m = (12345 % 3600) / 60;
		int s = (12345 % 3600) % 60;

		System.out.print(h + "시 ");
		System.out.print(m + "분 ");
		System.out.print(s + "초 ");
	}
}
