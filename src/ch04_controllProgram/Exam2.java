package ch04_controllProgram;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		if('A' <= ch && 'Z' >= ch) {
			System.out.println("�빮��");
		} else if('a' <= ch && 'z' >= ch) {
			System.out.println("�ҹ���");
		} else if('0' <= ch && '9' >= ch) {
			System.out.println("����");
		} else {
			System.out.println("��Ÿ����");
		}	
		
	}

}
