package ch03_op;

public class OpEx11 {
	public static void main(String[] args) {
	
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		System.out.println(Integer.toBinaryString(-727379968));
	}	
		
}
