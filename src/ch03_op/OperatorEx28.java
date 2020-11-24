package ch03_op;

public class OperatorEx28 {
	public static void main(String[] args) {
		
		int x = 0xAB;
		int y = 0xF;
		
		System.out.printf("x = %#x \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#x \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#x | %#x = %#x \t%s%n", x, y, x|y, toBinaryString(x | y));
		System.out.printf("%#x & %#x = %#x \t%s%n", x, y, x&y, toBinaryString(x & y));
		System.out.printf("%#x ^ %#x = %#x \t%s%n", x, y, x^y, toBinaryString(x ^ y));
		System.out.printf("%#x ^ %#x ^ %#x = %#x %s%n", x, y, y, x^y^y, toBinaryString(x ^ y ^ y));

	}
	
	static String toBinaryString(int x) {
		
		String zero =  "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		
		return tmp.substring(tmp.length()-32);
	}
}
