package ch07_OOP2;
/*
 *  ��� ����
 *  
 *  1. �ڼհ�ü�� ��ü ������ �θ�ü�� ���� �����Ѵ�.
 *  2. �ڼհ�ü�� �θ� ��ü�� ����� ���� �� �� �ִ�.
 *  3. Ŭ�������� ����� ���� ��Ӹ� �����ϴ�.
 *   �ڼ�Ŭ������ �θ�� �Ѱ��� �����ϴ�.
 *  4. ���Ŭ������ object Ŭ������ ��ӹ޴´�.
 *  5. ��� ��ü�� object Ŭ������ ��ü�� �����Ѵ�.
 *  6. ��� ��ü�� object Ŭ������ ����� ������ �����ϴ�.
 *  
 */

class Phone {
	static int num;
	boolean power;
	int number;
	Phone(){
		System.out.println("Phone ������");
	}
	
	void power() {
		power = !power;
	}
	void send() {
		if(power) System.out.println("��ȭ�ɱ�");
	}
	void recevive() {
		if(power) System.out.println("��ȭ�ޱ�");
	}
}

class SmartPhone extends Phone {
	
	void setApp(String name) {
		if(power) System.out.println(name + " ��ġ �� ~~~~");	
	}

	@Override
	public String toString() {
		return "SmartPhone";
	}
}


public class PhoneEx1 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		System.out.println(sp.toString());
		sp.power = true;
		sp.send();
		sp.recevive();
		sp.setApp("���̹�");
	}

}
