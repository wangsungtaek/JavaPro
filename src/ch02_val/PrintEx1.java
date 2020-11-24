package ch02_val;

public class PrintEx1 {

	public static void main(String[] args) {
		 byte b = 1;
		 short s = 2;
		 char c = 'A';
		 
		 int finger = 10;
		 long big = 100_000_000L;
		 long big2 = 100000000L;
		 long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		 int octNum = 010;
		 int hexNum = 0x10;
		 int binNum = 0b10;
		 
		 System.out.printf("b = %d%n", b);
		 System.out.printf("s = %d%n", s);
		 System.out.printf("c = %c, %d %n", c, (int)c);
		 System.out.printf("finget=[%6d]%n", finger);
		 System.out.printf("finget=[%-6d]%n", finger);
		 System.out.printf("finget=[%06d]%n", finger);
		 System.out.printf("big=%d%n", big);
		 System.out.printf("big2=%d%n", big2);
		 System.out.printf("hex=%#x%n", hex);
		 System.out.printf("octNum=%o, %d%n", octNum, octNum);
		 System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		 System.out.printf("hexNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
	}
}
