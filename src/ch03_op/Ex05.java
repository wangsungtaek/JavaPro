package ch03_op;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int coin;
		System.out.println("금액을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		coin = scan.nextInt();
		
		int won500 = coin / 500;
		int won100 = (coin % 500) / 100;
		int won50 = (coin % 100) / 50;
		int won10 = (coin % 50) / 10;
		int won1 = (coin % 50) % 10;
		
		System.out.println("500원 : " + won500 + "개");
		System.out.println("100원 : " + won100 + "개");
		System.out.println("50원 : " + won50 + "개");
		System.out.println("10원 : " + won10 + "개");
		System.out.println("1원 : " + won1 + "개");
	
	}
}
