package ch06_OOP1;
/*
 *  �ʱ�ȭ �� ����
 *  static �ʱ�ȭ �� :
 *  		�ֿ��� : Ŭ���� ������ �ʱ�ȭ
 *  		����ñ� : Ŭ���� ������ �ε� �ǰ�, �ѹ� ����.
 *  
 *  �ν��Ͻ� �ʱ�ȭ �� :
 *  		�ֿ��� : �ν��Ͻ� ������ �ʱ�ȭ, �����ڿ� ����� ��ħ
 *  		���� �ñ� : ��ü ������ ������ ȣ������ ���� ȣ����.
 *  
 *  class�� call -> static ���� -> static block -> sattic method
 *  ��üȭ -> instance ���� -> instance block -> ������
 */

public class InitEx {
	static int cv;	// Ŭ���� ����
	int iv;			// �ν��Ͻ� ����
	InitEx(){		// ������
		System.out.println("5, ������ ȣ���");
	}
	static {		// Static �ʱ�ȭ ��
		cv = (int)(Math.random() * 100);
		System.out.println("1, Ŭ���� �ʱ�ȭ �� cv = " + cv);
		// iv = (int)(Math.random() * 100); // error
	}
	{
		//�ν��Ͻ� �ʱ�ȭ ��
		iv = (int)(Math.random() * 100);
		System.out.println("4, �ν��Ͻ� �ʱ�ȭ ��. ������ ���� ���� ȣ���" + iv);
	}

	public static void name() {
		System.out.println("========main");
	}

	public static void main(String[] args) {
		System.out.println("2. main �޼ҵ� ����.");
		System.out.println("3 main init1 ��ü ����");
		InitEx init1 = new InitEx();
		name();
		System.out.println("main init2 ��ü ����");
		InitEx inti2 = new InitEx();
		
	}

}
