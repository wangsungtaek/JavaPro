package ch03_op;

import java.util.Scanner;

public class Exam1 {

		public static void main(String[] args) {
			System.out.print("���ڸ� �Է��ϼ���>>");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			String a = (num > 0) ? "���" : (num < 0) ? "����" : "0" ;
			System.out.println(a);
		}
}
