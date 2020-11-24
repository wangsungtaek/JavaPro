package ch06_Test;

class Rectangle {
	double width;
	double height;
	
	void area() {
		System.out.println(width*height);
	}
	void length() {
		System.out.println((width+height)*2);
	}
	
	Rectangle(){
		
	}
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
}

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		System.out.print("���� : ");
		r1.area();
		System.out.print("�ѷ� : ");
		r1.length();
		// ���� 30, ���ΰ� 20�� ���簢���� ��ü�� �����ϰ�, ����, �ѷ��� ����ϱ�
		Rectangle r2 = new Rectangle();
		r2.width = 30;
		r2.height = 20;
		System.out.print("���� : ");
		r2.area();
		System.out.print("�ѷ� : ");
		r2.length();
		
	}
}
