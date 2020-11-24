package ch03_val;

public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1 = -22; //변수의 선언. b2저장공간 메모리 1바이트 할당.
		//바이트로 저장할 수 있는 값의 범위. -128~127 저장가능.
		byte b2 ;    // 로컬변수는 초기화를 한번에 하는게 좋음. 
		b2 = -128; //변수의 초기화
		b1 = 127;
		short s1 = -220;
		int i1 = 100;
		long l1 = 1000;
		
	System.out.println("b1=" + b1);
	System.out.println("s1=" + s1);
	System.out.println("i1="+ i1);
	System.out.println("l1=" + l1);
	System.out.println("b2=" + b2);
	
	
	float f1 = 1.0f;
	double d1 = 1.0;
	double d12 = 1d;
	System.out.println("f1=" + f1);
	System.out.println("d1=" + d1);
	System.out.println("d12" + d12);
	}

}
