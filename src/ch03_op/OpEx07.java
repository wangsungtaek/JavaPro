package ch03_op;

public class OpEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//비트연산자 
		
		System.out.println("6 & 3 ="+ (6&3));
		//둘다 1이여야만 1 
		//6: 0110
		//3: 0011
		//----------
		//&  0010  : 2 
		System.out.println("6|3="+ (6|3));
		//둘중 한개만 1이여도 1이됨
		//6: 0110
		//3: 0011
		//----------
		//|  0111   :7
		System.out.println("6^3="+(6^3));
		//같으면 0, 다르면 1
		//6: 0110
		//3: 0011
		//---------
		//^  0101  :5
		System.out.println("~10 ="+ (~10));
		//0은 1이 되고 1은 0이 됨
		//10 : 00001010
		//-----------
		//~  : 11110101 : -11
		
	}

}
