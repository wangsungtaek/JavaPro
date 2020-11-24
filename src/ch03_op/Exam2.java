package ch03_op;

/*
 * 반지름 : 5
 * 원주를 pi = 3.14
 * 
 * 둘레 : 반지름 x 2 x pi 
 * 면적 : 반지름 x 반지름 x 2 
 * 
 */

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {

		System.out.println("반지름을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		double pi = 3.141592;
		double cir = r * 2 * pi;
		double area = r * r * pi;
		
		System.out.println("면적은 : " + area);
		System.out.println("둘레는 : " + cir);
	
	}

}
