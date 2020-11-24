package ch03_op;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int str = scan.nextInt();

		if((str%10) == 0) {
			System.out.println(str-str);
		} else {
			System.out.println((((str/10)+1)*10)-str);
		}
	
	}

}
