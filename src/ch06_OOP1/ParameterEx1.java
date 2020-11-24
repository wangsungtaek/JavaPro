package ch06_OOP1;
/* 
 * 매개변수 예제.
 * 기본형 매개변수
 * 참조형 매개변수
 */
class Value {
	int val;
}

public class ParameterEx1 {

	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		
		change1(v.val);
		System.out.println("2 : change1() After : " + v.val);
		change2(v);
		System.out.println("4 : change2() After : " + v.val);
	}	

	static void change1(int val) {
		val += 100;
		System.out.println("1 : chage1() : " + val);
		
	}
	static void change2(Value v) {
		v.val += 100;
		System.out.println("3 : chage2() : " + v.val);
	}

}
