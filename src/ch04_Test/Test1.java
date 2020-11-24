package ch04_Test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int temp ;
		boolean answer = true;
		
		while(num != 0) {
			
			temp = num % 10;
			num /= 10;
			if(temp != (num%10)) {
				answer = false;
			} else {
				answer = true;
			}	
		}
		System.out.println(answer);		
	}

}
