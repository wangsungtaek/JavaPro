package ch04_controllProgram;

import java.util.Scanner;

public class LoopEx4 {

	public static void main(String[] args) {
		/*
		//1. ��ǻ���� ������ �� ����
		0 < = Math.random() * 100 < 100.0
		0 < = (int)Math.random() * 100 < 100.0
		1 < = (int)Math.random() * 100 + 1 < 101
		*/
		double a = Math.random();
		int ans = (int)(a * 100) + 1;
		
		System.out.println(a);
		
		Scanner scan = new Scanner(System.in);
		int input;
		int cnt = 0;
		
		do {
			System.out.println("1~100 ������ ���ڸ� �Է��ϼ���");
			input = scan.nextInt();
			if(ans > input) {
				System.out.println("�� ū�� �Դϴ�.");
			} else if(ans<input) {
				System.out.println("�� ���� �Դϴ�.");
			} else {
				System.out.println("�����Դϴ�..");
			}
			System.out.println(ans);
			cnt++;
		} while(ans != input);
		System.out.println("Ƚ�� : " + cnt);
	}
}
