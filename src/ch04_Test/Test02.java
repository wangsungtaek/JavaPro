package ch04_Test;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ǻ���ġ�������� ���� 1000�������� ����Ʈ
				//1 1 2 3 5 8 13 21 34 55 89 ��
				int i = 1;
				int sum = 0;
				while(sum<1000) {
					sum += i;
					System.out.print(i+" ");
					i += i ;
					
				}
				System.out.print(sum);
	}
}
