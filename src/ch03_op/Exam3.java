package ch03_op;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		System.out.println("����� ������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int box = (num%10 == 0) ? num/10 : (num/10+1) ;
		
		System.out.printf("�ʿ��� ������ ������ : %d", box);
	}

}
