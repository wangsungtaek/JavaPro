package ch03_op;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch = str.charAt(0);
		
		
		if(96<ch && 123>ch) {
			System.out.println(ch -= 32);
		} else {
			System.out.println("�ҹ��ھƴ�");
		}
	}

}
