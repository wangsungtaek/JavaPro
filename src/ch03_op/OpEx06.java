package ch03_op;

public class OpEx06 {
	public static void main(String[] args) {
		//대입연산자
		
		int num = 100;
		System.out.println(num);
		num += 10; //num=num+10;
		System.out.println(num);
		num /= 10; //num=num/10;
		System.out.println(num);
		num *= 2+3; //num=num*(2+3);
		System.out.println(num);
		
		byte b=1;
		b *=2; //b=b*2
		b=(byte) (b*2);
		System.out.println(b); 
		b *= 2;
		System.out.println(b);
		b *= 2;
		System.out.println(b);
		
	}
}
