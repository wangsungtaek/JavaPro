package ch07_OOP2;

class Parent {
	int x = 10;
	
	Parent() {
		x = 400;	
	}
	Parent(int x){
		this.x = x;
	}
}

class Child2 extends Parent {
	int x = 20;
	Child2(){	// 기본생성자 생략됐지만 기본생성자가 실행됨.
		
	}
	
	/*
	 * Chile2() { super(100); } 
	 * 
	 */
	void method() {
		int x = 30;
		// x 지역변수가 정해져 있어서 로컬변수 x를 의미한다.
		System.out.println(x); // 30
		System.out.println(this.x); // Child가 가지고 있는 변수 x : 20 ;
		System.out.println(super.x); // 부모 클래스가 가지고 있는 변수	
	}
}
public class SuperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c = new Child2();
		c.method();
	}

}
