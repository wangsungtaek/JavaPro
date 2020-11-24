package ch05_Array;
	// 10진수 -> 8진수 변환 예제
import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		int[] octal = new int[32];
		System.out.println("숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int index = 0;
		
		while(num != 0) {
			octal[index++] = num % 8;		
			num /= 8; 
		}
		
		System.out.print("8진수 : ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(octal[i]);
		}
	}
}