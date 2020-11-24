package ch03_op;
/*
 *  증감 연산자 예제 2 : 증감연산자와 다른연산자를 같이 사용하는 경우
 */

public class OpEx2 {

	public static void main(String[] args) {

			int x = 5;
			int y = 0;
			
			y = x++; 
			System.out.println("x = "+x+", y = "+y);	// 6, 5
			y = ++x;
			
			System.out.println("x = "+x+", y = "+y);	// 7, 7
			System.out.println("x = "+ x++);			// 7
			System.out.println("x = "+ ++x);			// 9
			x = y--;
			System.out.println("x = "+x+", y = "+y);	// 7, 6
			x = --y;	
			
			System.out.println("x = "+x+", y = "+y);	// 5, 5		
	}
}
