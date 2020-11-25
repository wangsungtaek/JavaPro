package ch07_OOP2;

class Parent4 {	int x = 10; }
class Child4 extends Parent4 {
	int x = 20;
	void method() {
		System.out.println("child method");
	}
}

public class InstanceOfEx1 {

	public static void main(String[] args) {
		Parent4 p = new Child4();
		if(p instanceof Child4) {
			System.out.println("p �������� ��ü�� Chil4 ��ü��");
			Child4 c = (Child4) p;
			System.out.println(c.x);
			c.method();
		}
		if(p instanceof Parent4) {
			System.out.println("p �������� ��ü�� Parent4 ��ü��");
		}
		/*
		 *  ��� Ŭ������ Object Ķ������ ��� �޴µ�. => ��� ��ü�� Object ��ü�� �����Ѵ�.
		 *  => ��� ��ü�� Object Ÿ���� ���������� ������ �����ϴ�.
		 *  
		 */
		if(p instanceof Object) {
			System.out.println("p �������� ��ü�� Object ��ü��.");
			Object o = p;
			System.out.println(p.x);
//			System.out.println(o.x);  // x�� Object Ŭ������ ����� �ƴϴ�. ������ �� ����.
		}
	}
}
