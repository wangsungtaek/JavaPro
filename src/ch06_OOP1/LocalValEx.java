package ch06_OOP1;
/*
 * �������� : �޼��� ���ο� ����� ����.
 * 			�ݵ�� �ʱ�ȭ �Ǿ�� �Ѵ�.
 * 			�Ű������� ����������.
 * 
 */
public class LocalValEx {
	static String grade2;	// ��� ����
	public static void main(String[] args) {	// �Ű����� ��������
		// args : ��������
		int num = 0;
		boolean b = true;
		if(b) num =100;
		
		System.out.println(num);
		String grade="";
		int score = 80; // ��������
		switch(score/10) {
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F"; break;
		}
		System.out.println("���� : " + grade);
		System.out.println("����2 : " + grade2);
	}
}
