package ch06_OOP1;
/*
 * ���� ��ġ�� ���� ������ ����
 * Ŭ����(static) ���� : Ŭ���� ������ ����.
 *           static ������ ������
 *           Ŭ���� ������ �޸𸮿� �ε�ɶ� �����޸� �Ҵ�.
 *           ��üȭ(new �����ڷ� �ּһ��� )�� ���þ��� ������.
 *           �޸��Ҵ� ��ġ : Ŭ���� ����.
 *           Ŭ������ ��� ��ü�� ���� ������ ����.
 *           ��� : Ŭ������.������.   Math.random();
 * �ν��Ͻ����� : Ŭ���� ������ �����
 *            Ÿ��  ������; �����.  String str;
 *            ��üȭ��(new Object() ) �޸� �Ҵ����.  
 *            �ݵ�� ��üȭ �Ǿ�� ������ ����� �� ����
 *            �޸� �Ҵ� ��ġ : ������  heap area
 *           ��� : ����������.������            
 * ��������      : �޼��� ���ο��� �����.
 * (�Ű���������) �ʱ�ȭ�Ǿ����.
 *            ���������� ����ɶ� �޸� �Ҵ�.
 *            �޸��Ҵ� : ���ÿ���          
 *            ��� : ������ 
 */
class Sonata {
	String color ;	// �ν��Ͻ� ����
	int number;	// �ν��Ͻ� ����
	static int width = 250;	// Ŭ���� ����
	static int height = 150;	// Ŭ���� ����
	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}

public class SonataEx1 {

	public static void main(String[] args) {
	
		System.out.println("�ڵ��� ũ�� : " + Sonata.width + "," + Sonata.height);
		Sonata car1 = new Sonata();
		car1.color = "whilte";
		car1.number = 1234;
		System.out.println("car1 : " + car1);	//car1.toString() �޼��� ȣ��
		Sonata car2 = new Sonata();
		car2.color = "black";
		car2.number = 2345;
		System.out.println("car2 : " + car2);
		car2.width = 300;
		car1.height = 200;
		
		String temp = "aaa : " + car1;
		System.out.println(temp);
		
		System.out.println("============");
		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);
		println(car1);
	}
	
	public static void println(Object o) {
		System.out.println(o.toString());
	}

}
