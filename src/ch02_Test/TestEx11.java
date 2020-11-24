package ch02_Test;

public class TestEx11 {

	public static void main(String[] args) {
		byte b = 127;
		byte c = 126;
	//	byte d = b + c;
		int e = (b +c);
		byte f =(byte)(b+c);
		System.out.println("b = " + Integer.toBinaryString(b));
		System.out.println("c = " + Integer.toBinaryString(c));
		System.out.println("e = " + Integer.toBinaryString(e));
		
		
		System.out.println();
		
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
	}

}
