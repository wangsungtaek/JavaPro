package ch03_op;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int coin;
		System.out.println("�ݾ��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		coin = scan.nextInt();
		
		int won500 = coin / 500;
		int won100 = (coin % 500) / 100;
		int won50 = (coin % 100) / 50;
		int won10 = (coin % 50) / 10;
		int won1 = (coin % 50) % 10;
		
		System.out.println("500�� : " + won500 + "��");
		System.out.println("100�� : " + won100 + "��");
		System.out.println("50�� : " + won50 + "��");
		System.out.println("10�� : " + won10 + "��");
		System.out.println("1�� : " + won1 + "��");
	
	}
}
