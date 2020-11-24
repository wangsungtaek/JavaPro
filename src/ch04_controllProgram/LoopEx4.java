package ch04_controllProgram;

import java.util.Scanner;

public class LoopEx4 {

	public static void main(String[] args) {
		/*
		//1. 컴퓨터의 임의의 수 저장
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
			System.out.println("1~100 사이의 숫자를 입력하세요");
			input = scan.nextInt();
			if(ans > input) {
				System.out.println("더 큰수 입니다.");
			} else if(ans<input) {
				System.out.println("더 작은 입니다.");
			} else {
				System.out.println("정답입니다..");
			}
			System.out.println(ans);
			cnt++;
		} while(ans != input);
		System.out.println("횟수 : " + cnt);
	}
}
