package ch03_op;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int str = scan.nextInt();
		
		if(str >= 90) {
			System.out.println("A����");
		} else if(str >= 80) {
			System.out.println("B����");
		} else if(str >= 70) {
			System.out.println("C����");
		} else if(str >= 60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}
	}

}
