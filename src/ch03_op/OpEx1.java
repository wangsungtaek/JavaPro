package ch03_op;
/*
 * 
 *  ����������
 * 	 ++ : ������ ���� 1����.
 *   -- : ������ ���� 1����.
 */


public class OpEx1 {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 5;
		
		x++;
		y--;
		System.out.println("x = "+x+", y = "+y);
		
		x=y=5;
		x++;
		y--;
		System.out.println("x = "+x+", y = "+y);
	}
}
