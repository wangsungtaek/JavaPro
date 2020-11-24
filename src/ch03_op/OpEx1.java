package ch03_op;
/*
 * 
 *  증감연산자
 * 	 ++ : 숫자의 값을 1증가.
 *   -- : 숫자의 값을 1감소.
 */


public class OpEx1 {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 5;
		
		x++;
		y--;
		System.out.println("x = "+x+", y = "+y);
		
		x=y=5;
		x++;
		y--;
		System.out.println("x = "+x+", y = "+y);
	}
}
