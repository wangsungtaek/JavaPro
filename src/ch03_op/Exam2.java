package ch03_op;

/*
 * ������ : 5
 * ���ָ� pi = 3.14
 * 
 * �ѷ� : ������ x 2 x pi 
 * ���� : ������ x ������ x 2 
 * 
 */

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {

		System.out.println("�������� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		double pi = 3.141592;
		double cir = r * 2 * pi;
		double area = r * r * pi;
		
		System.out.println("������ : " + area);
		System.out.println("�ѷ��� : " + cir);
	
	}

}
