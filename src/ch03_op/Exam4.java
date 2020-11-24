package ch03_op;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		System.out.println("임이의 음수나 양수를 입력 하세요 예(-10, 7)");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.printf("%d 의 절대값은 : %d", num, (num > 0) ? num : (num < 0) ? -num : 0);	
	}
}
