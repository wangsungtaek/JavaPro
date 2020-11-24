package ch06_Test;

class Rectangle3 {
	int width;
	int height;
	int serialNo;
	static int sno;
	
	int area() {
		return width*height;
	}
	int length() {
		return ((width+height)*2);
	}
	
	public String toString() {
		return serialNo + "������� (����,����) => ���� : " + width +", �ѷ� : "+ height;
	}
}

public class Exam4 {
	public static void main(String[] args) {
		Rectangle3[] r = new Rectangle3[3];
		int totalArea = 0;
		int totalLength = 0;
						
		for(int i=0; i<r.length; i++) {
			r[i] = new Rectangle3();
			r[i].width = i * 5 + 10;
			r[i].height = i * 5 + 20;
			r[i].serialNo = ++Rectangle3.sno;
			System.out.println(r[i]);
			totalArea += r[i].area();
			totalLength += r[i].length();			
		}
		System.out.println("��ü �簢�� ������ �� : " + totalArea);
		System.out.println("��ü �簢�� �ѷ��� �� : " + totalLength);
	}
}
