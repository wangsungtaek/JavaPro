package ch04_controllProgram;

import java.util.Scanner;

public class Exam3 {
/**
 * 4�� ����� ����
 * 4�� ����� �ƴ����� 400�� ����� ����
 * 4�� ����� �ƴ����� 100�� ����� ���
 * 4�� ����� �ƴϰ� 100�� ����� �ƴϸ� ����
 */
	
	public static void main(String[] args) {
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if((year%4) != 0) {
			System.out.println("���");	
		} else if(((year%400) != 0) && (year%100) == 0) {
			System.out.println("���");
		} else {
			System.out.println("����");
		}
	}
}
