package ch03_op;
/*
 * 대입 연산자 : 
 */

public class OpEx3 {

	public static void main(String[] args) {
		
		int num = 100;
		System.out.println(num);	// 100
		num += 10;
		System.out.println(num);	// 110
		num /= 10;
		System.out.println(num);	// 11
		num *= 2+3;
		System.out.println(num);	// 55
		
		byte b = 1;
		b *= 2;
		b = (byte)(b*2);
		System.out.println(b);		// 4
		b *= 2;
		System.out.println(b);		// 8
		b *= 2;
		System.out.println(b);		// 16
		
	}

}
