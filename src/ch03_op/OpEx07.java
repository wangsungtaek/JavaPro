package ch03_op;

public class OpEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��Ʈ������ 
		
		System.out.println("6 & 3 ="+ (6&3));
		//�Ѵ� 1�̿��߸� 1 
		//6: 0110
		//3: 0011
		//----------
		//&  0010  : 2 
		System.out.println("6|3="+ (6|3));
		//���� �Ѱ��� 1�̿��� 1�̵�
		//6: 0110
		//3: 0011
		//----------
		//|  0111   :7
		System.out.println("6^3="+(6^3));
		//������ 0, �ٸ��� 1
		//6: 0110
		//3: 0011
		//---------
		//^  0101  :5
		System.out.println("~10 ="+ (~10));
		//0�� 1�� �ǰ� 1�� 0�� ��
		//10 : 00001010
		//-----------
		//~  : 11110101 : -11
		
	}

}
