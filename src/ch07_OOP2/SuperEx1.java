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
	Child2(){	// �⺻������ ���������� �⺻�����ڰ� �����.
		
	}
	
	/*
	 * Chile2() { super(100); } 
	 * 
	 */
	void method() {
		int x = 30;
		// x ���������� ������ �־ ���ú��� x�� �ǹ��Ѵ�.
		System.out.println(x); // 30
		System.out.println(this.x); // Child�� ������ �ִ� ���� x : 20 ;
		System.out.println(super.x); // �θ� Ŭ������ ������ �ִ� ����	
	}
}
public class SuperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c = new Child2();
		c.method();
	}

}
