package ch04_homework;

import java.util.Scanner;

public class Exam1_for {
	
	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String inputText = scanner.next();
		String a ="";
		String b ="";
		
		int quotient = inputText.length() / 2;
		
		int i = 0;
		for(; i<quotient; i++) {
			if(inputText.charAt(i) != inputText.charAt(inputText.length()-i-1)) {	
				break;
			}
		}
		if(i >= quotient) {
			System.out.println("대칭");
		} else {
			System.out.println("비대칭");
		}
		
		
		
		

//		if((inputText.length()%2) != 0) {
//			for(int i=0; i<(inputText.length()/2); i++) {
//				a += inputText.charAt(i);
//			}
//			for(int j=(inputText.length()-1); (inputText.length()/2) <j; j--) {
//				b += inputText.charAt(j);
//			}
//		} else {
//			for(int i=0; i<(inputText); i++) {
//				a += inputText.charAt(i);
//			}
//			for(int j=(inputText.length()-1); (inputText.length()/2) <= j; j--) {
//				b += inputText.charAt(j);
//			}	
//		}
//		if(a.equals(b)) {
//			System.out.println("�넫�슣�뒭占쏙옙燁삼옙");
//		} else {
//			System.out.println("�넫�슣�뒭占쏙옙燁삼옙占쎈툡占쎈뻷");
//		}
//		System.out.println(a);
//		System.out.println(b);
	}
}
