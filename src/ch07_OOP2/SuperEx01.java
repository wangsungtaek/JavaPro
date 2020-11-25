package ch07_OOP2;

/*
 *  �߻� Ŭ����
 */
abstract class Shape {
	String type;
	Shape(String type) { this.type = type; }
	abstract double area();		// �߻� �޼���
	abstract double length();	// �߻� �޼���
}

class Circle extends Shape {
	int r;
	Circle(int r) {
		super("��");
		this.r = r;
	}
	@Override
	double area() {
		return Math.PI * r * r;
	}
	@Override
	double length() {
		return Math.PI * r * 2;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", type=" + type + "]" + ", ����"
	+ area() + ", �ѷ�:" + length();
	}
}

class Rectangle extends Shape {
	int width;
	int height;
	
	Rectangle(int width, int height) {
		super("�簢��");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() { return width * height; }

	@Override
	double length() { return 2* (width + height); }

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", type=" + type + ", area()="
	+ area() + ", length()=" + length() + "]";
	}
}
public class SuperEx01 {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5,5);
		
		for(Shape s : shapes) {
			System.out.println(s);
		}
	}

}
