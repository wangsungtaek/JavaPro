package ch04_controllProgram;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int score = scan.nextInt();
		
		String grade;
		switch(score / 10) {
			case 10 :
				
			case 9 : grade = "A";
					break;
			case 8 : grade = "B";
					break;
			case 7 : grade = "C";
					break;
			case 6 : grade = "D";
					break;
			default: grade = "F";
		}
		System.out.println(grade + "����");
	}

}
