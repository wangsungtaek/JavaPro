package Test;
/*
 * 삼각형 만들기 예제
 */
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		int length = len*2+1;
		int center = length/2;
		
		for(int i=1; i<=len; i++) {
			for(int j=1; j<=length; j++) {
				if((center-i) < j && (center+i) > j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
