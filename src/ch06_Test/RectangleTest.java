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
		System.out.print("넓이 : ");
		r1.area();
		System.out.print("둘레 : ");
		r1.length();
		// 가로 30, 세로가 20인 직사각형의 객체를 생성하고, 넓이, 둘레를 출력하기
		Rectangle r2 = new Rectangle();
		r2.width = 30;
		r2.height = 20;
		System.out.print("넓이 : ");
		r2.area();
		System.out.print("둘레 : ");
		r2.length();
		
	}
}
