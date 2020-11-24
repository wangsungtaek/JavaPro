package ch03_op;

import java.util.Scanner;

public class Exam1 {

		public static void main(String[] args) {
			System.out.print("숫자를 입력하세요>>");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			String a = (num > 0) ? "양수" : (num < 0) ? "음수" : "0" ;
			System.out.println(a);
		}
}
