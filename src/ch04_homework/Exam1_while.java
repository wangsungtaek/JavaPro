package ch04_homework;

import java.util.Scanner;

public class Exam1_while {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		String inputText = scanner.next();
		
		int quotient = inputText.length() / 2;
		int loopCount = 0;

		while(loopCount < quotient) {
			if(inputText.charAt(loopCount) != inputText.charAt(inputText.length()-loopCount-1)) {
				break;
			}
			else loopCount++;
		}
		if(loopCount >= quotient){
			System.out.println("��Ī");
		} else {
			System.out.println("���Ī");
		}
	
	}

}
