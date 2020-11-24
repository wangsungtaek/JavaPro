package ch05_Array;
	// 10진수 -> 16진수 변환 예제
import java.util.Scanner;
	
public class Exam6 {

	public static void main(String[] args) {
		char[] data = 
			{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] h = new char[32];
		System.out.println("숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int index = 0;
		int divnum = num;
		
		while(divnum != 0) {
			h[index++] = data[divnum % 16];
			System.out.println(divnum % 16);
			divnum /= 16;
		}
		
		System.out.print("16진수 : ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(h[i]);
		}
		System.out.println();
	}
}


/**
		System.out.println((char)(1+48));
		System.out.println((char)(11+55));
**/