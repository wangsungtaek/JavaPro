package ch03_op;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		System.out.println("실수도는 정수를 입력하세요 예(11.5, 20)");
		Scanner scan = new Scanner(System.in);
		double d = scan.nextDouble();
		int a = (int)d;
		
		if(d==a) {
			System.out.println(d + " : 정수");
		} else {
			System.out.println(d + " : 실수");
		}
	}
}
