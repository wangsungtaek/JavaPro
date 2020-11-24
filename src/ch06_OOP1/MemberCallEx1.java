package ch06_OOP1;

public class MemberCallEx1 {

	static int cv1 = 10;
	static int cv2 = cv1;	// Ŭ��������� ȣ��
	
	int iv1 = 100;			// �ν��Ͻ������ ȣ��
	int iv2 = iv1;			// �ν��Ͻ�������� Ŭ���� ��� ȣ��
	int iv3 = cv1;			// Ŭ���� ������� �ν��Ͻ� ��� ȣ��. => ��üȭ �ʿ�
//	static int cv3 = iv1;
	static int cv3 = new MemberCallEx1().iv1;	// Ŭ���� ������� �ν��Ͻ� ��� ȣ��. => ��üȭ �ʿ�
	
	public static void main(String[] args) {
//		cv2 = iv1;	// Ŭ���� ����� main �޼��忡�� iv1 �ν��Ͻ���� ���� �Ұ�
		cv2 = new MemberCallEx1().iv1;	// iv1 = cv2;
		new MemberCallEx1().iv1 = cv2;	// method(); // error
		new MemberCallEx1().method1();
		method2();
	}
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);		
	}
	static void method2() {
		System.out.println(cv1 + cv2);
//		System.out.println(iv1 + iv2);
		MemberCallEx1 m = new MemberCallEx1();
		System.out.println(m.iv1 + m.iv2);
	}
	
}