package ch04_controllProgram;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int str = scan.nextInt();
		
		if(str > 0) {
			System.out.println("���");
		} else if(str < 0) {
			System.out.println("����");
		} else {
			System.out.println("0");
		}
	}
}
