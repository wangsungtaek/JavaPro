package ch06_OOP1;

/*
 * 멤버 메서드의 종류
 * 클래스 메서드, 인스턴스 메서드
 */
class Math2 {
	int a, b;
	int x;
	
// 인스턴스 메서드 : 객체화가 되어야 메서드의 호출이 가능함. 참조변수명.메서드명() 호출해야함.
	int add1() {
		for (int i=0; i<5; i++) {
			int x = 7;
		}
		System.out.println(x);
		return a + b;
	}
// 클래스 메서드 : 클래스정보 로드될때 메서드의 호출이 가능함. 클래스명.메서드명() 호출할 수 있다.
	static int add2(int a, int b) {
		// x = 5;
		return a + b;
	}
}

public class Math2Ex {

	public static void main(String[] args) {
		
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1());
		System.out.println(m.add2(100, 200));
		System.out.println(Math2.add2(100, 200));
	}

}
