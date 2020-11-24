package ch06_Test;

class Rectangle4 {
	int width;
	int height;
	int serialNo;
	static int sno;

	Rectangle4(int w, int h){
		width = w;
		height = h;
		serialNo = ++sno;
	}
	
	int area() {
		return width*height;
	}
	int length() {
		return (width+height)*2;
	}
	boolean isSquare( ) {
		return width==height;
	}
	void info() {
		System.out.println
		(serialNo + "���簢�� : (" + width +"," + height + ") "
		 + "����:" + area() + ", �ѷ�:" + length() +(isSquare()? " ���簢��" : " ���簢��"));
	}
}

public class Exam6 {
	public static void main(String[] args) {
		Rectangle4[] recarr = new Rectangle4[3];
		recarr[0] = new Rectangle4(10,10);
		recarr[1] = new Rectangle4(20,10);
		recarr[2] = new Rectangle4(25,25);
	
		for(Rectangle4 r : recarr) {
			r.info();
		}
		
		
	}
}
