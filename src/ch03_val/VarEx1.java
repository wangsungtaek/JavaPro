package ch03_val;

public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1 = -22; //������ ����. b2������� �޸� 1����Ʈ �Ҵ�.
		//����Ʈ�� ������ �� �ִ� ���� ����. -128~127 ���尡��.
		byte b2 ;    // ���ú����� �ʱ�ȭ�� �ѹ��� �ϴ°� ����. 
		b2 = -128; //������ �ʱ�ȭ
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
