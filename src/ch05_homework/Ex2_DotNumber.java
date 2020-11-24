package ch05_homework;

import java.util.Scanner;

public class Ex2_DotNumber {

	public static void main(String[] args) {
		System.out.println("숫자를입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		
		char inputChar =' ';
		int inputIndex = 0;
			
		char[][] numberDot = {
			{'*','*','*'}, {' ','*',' '}, {'*','*','*'}, {'*','*','*'}, {'*',' ','*'}, {'*','*','*'}, {'*','*','*'}, {'*','*','*'}, {'*','*','*'}, {'*','*','*'},
			{'*',' ','*'}, {' ','*',' '}, {' ',' ','*'}, {' ',' ','*'}, {'*',' ','*'}, {'*',' ',' '}, {'*',' ',' '}, {'*',' ','*'}, {'*',' ','*'}, {'*',' ','*'},
			{'*',' ','*'}, {' ','*',' '}, {'*','*','*'}, {'*','*','*'}, {'*','*','*'}, {'*','*','*'}, {'*','*','*'}, {'*',' ','*'}, {'*','*','*'}, {'*','*','*'},
			{'*',' ','*'}, {' ','*',' '}, {'*',' ',' '}, {' ',' ','*'}, {' ',' ','*'}, {' ',' ','*'}, {'*',' ','*'}, {' ',' ','*'}, {'*',' ','*'}, {' ',' ','*'},
			{'*','*','*'}, {' ','*',' '}, {'*','*','*'}, {'*','*','*'}, {' ',' ','*'}, {'*','*','*'}, {'*','*','*'}, {' ',' ','*'}, {'*','*','*'}, {'*','*','*'}
		};
		
		for(int k=0; k<=40; k+=10) {
			for(int i=0; i<inputString.length(); i++) {
				inputChar = (char) (inputString.charAt(i));
				inputIndex = (inputChar-48+k);
				for(int j=0; j<numberDot[inputIndex].length; j++) {
					System.out.print(numberDot[inputIndex][j]);
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
