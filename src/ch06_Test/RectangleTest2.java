package ch06_Test;

class Rectangle2 {
	double width;
	double height;
	
	void area() {
		System.out.println(width*height);
	}
	void length() {
		System.out.println((width+height)*2);
	}
	
	Rectangle2(){
		
	}
	Rectangle2(double width, double height){
		this.width = width;
		this.height = height;
	}
}

public class RectangleTest2 {
	public static void main(String[] args) {
		Rectangle2[] r = new Rectangle2[3];
						
		for(int i=0; i<r.length; i++) {
			r[i] = new Rectangle2();
			r[i].width = 10 + i;
			r[i].height = 20 + i;
			System.out.print(i + "번 사각형 넓이 : ");
			r[i].area();
			System.out.print(i + "번 사각형 둘레 : ");
			r[i].length();
		}
	}
}
