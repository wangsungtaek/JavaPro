package ch03_op;

public class OpEx05 {

	public static void main(String[] args) {
		System.out.println(10/8); //1 (int보다 작은타입 연산은 int로)/(int보다 큰 타입과 연산은 큰타입으로)
		System.out.println(10/-8);//-1
		System.out.println(-10/8);
		System.out.println(-10/-8);
		
		System.out.println(10%8);
		System.out.println(10%-8);
		System.out.println(-10%8);
		System.out.println(-10%-8); //%: 나머지 연산자 결과값의 부호 -> 피젯수의 부호와 같다.
		
	}
}
