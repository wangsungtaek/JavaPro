package ch04_controllProgram;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
	/*
		for(int i=0; i<len; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=len; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	*/
		for(int i=1; i<=len; i++) {
			for(int j=1; j<=len; j++) {
				System.out.print((j<i)?" ":"*");
			}
			System.out.println();
		}
	}

}

