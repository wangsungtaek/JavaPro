package ch03_op;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		System.out.println("사과의 갯수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int box = (num%10 == 0) ? num/10 : (num/10+1) ;
		
		System.out.printf("필요한 상자의 갯수는 : %d", box);
	}

}
