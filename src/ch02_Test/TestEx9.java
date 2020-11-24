package ch02_Test;

public class TestEx9 {

	public static void main(String[] args) {
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
	
		System.out.println(Integer.toBinaryString(var1));
		System.out.println(Integer.toBinaryString(var2));
		System.out.println(Integer.toBinaryString(var3));
		System.out.println(Integer.toBinaryString((int)var4));

		var4 = var1;
		System.out.println(var1+", "+var2);	// 127, 128
		
		var1 = (byte)var3;
		System.out.println(var1+","+var3);	// -128, 128
		
		float var5 = 123456.789123f;		
		double var6 = 123456.789123;
		
		var5 = (float)var6;
		System.out.println(var5+", "+var6);	//123456.789123, 123456.789123
		
		var6 = var5;
		System.out.println(var5+", "+var6); // 123456.789123, 123456.789123
		
	}

}
