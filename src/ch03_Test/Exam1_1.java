package ch03_Test;

import java.util.Scanner;

public class Exam1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = 0;
		int temp = num;
		while(temp != 0) {
			result *= 10;
			result += temp % 10;
			temp /= 10;
		}
		if(num == result) {
			System.out.println("�¿��Ī�� ");
		} else{
			System.out.println("��Ī�ƴ�");
		}
	}
}
