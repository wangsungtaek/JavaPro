package ch04_controllProgram;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		System.out.println("포인트를 입력하세요(1 ~1000) exit(9999)");
		Scanner scan = new Scanner(System.in);
		int point = 0;
		
		while(true) {
			point = scan.nextInt();
			if(point == 9999) {
				System.out.println("Exit");
				break;
			}
			System.out.println(point + "점");
			switch(point/200) {
			case 0 : System.out.println("상품이 없습니다.");
			break;
			case 4 : System.out.println("아파트,");
			case 3 : System.out.println("자동차,");
			case 2 : System.out.println("핸드폰,");
			case 1 : System.out.println("새우깡");

			}
			
		}
	}

}
