package ch03_op;
/*
 * 	Shift 연산자 : 비트이동 연산자
 *  
 * 
 */
public class OpEx8 {

	public static void main(String[] args) {
		byte a = 64;
		System.out.println("a << 2 : " + (a << 2));
		
		System.out.println(Integer.toBinaryString(a));
		
		System.out.println("8 << 2 : " + (8 << 2));
		/*
		 * 왼쪽으로 n비트만큼 이동. 오른쪽의 n비트 0으로 채움
		 * 
		 * 8 	:	0000 1000
		 * <<2	:	0010 0000 : 32
		 *
		 */
		
		System.out.println("-8 << 2 : " + (-8 << 2));
		/*
		 * 왼쪽으로 n비트만큼 이동. 오른쪽의 n비트 0으로 채움
		 * 
		 * -8 	:	1111 1000
		 * <<2	:	1110 0000 : -32
		 *
		 */
		
		System.out.println("8 >> 2 : " + (8 >> 2));
		/*
		 * 오른쪽으로 n비트만큼 이동. 왼쪽은 n비트 부호비트 채움
		 * 
		 * 8 	:	0000 1000
		 * >>2	:	0000 0010 : 2
		 *
		 */
		
		System.out.println("-8 >> 2 : " + (-8 >> 2));
		/*
		 * 오른쪽으로 n비트만큼 이동. 왼쪽은 n비트 부호비트 채움
		 * 
		 * -8 	:	1111 1000
		 * >>2	:	1111 1110 : -2
		 *
		 */
		
		System.out.println("8 >>> 2 : " + (8 >>> 2));
		/*
		 * 오른쪽으로 n비트만큼 이동. 왼쪽은 n비트 0으로 채움
		 * 
		 * 8 	:	0000 1000
		 * >>>2	:	0000 0010 : 2
		 *
		 */
		
		System.out.println("-8 >>> 2 : " + (-8 >>> 2));
		/*
		 * 오른쪽으로 n비트만큼 이동. 왼쪽은 n비트 0으로 채움
		 * 
		 * -8 	:	1111 1000
		 * >>>2	:	1111 1110 : 
		 *
		 */
	}

}
