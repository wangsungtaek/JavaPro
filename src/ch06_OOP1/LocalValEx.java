package ch06_OOP1;
/*
 * 지역변수 : 메서드 내부에 선언된 변수.
 * 			반드시 초기화 되어야 한다.
 * 			매개변수는 지역변수다.
 * 
 */
public class LocalValEx {
	static String grade2;	// 멤버 변수
	public static void main(String[] args) {	// 매개변수 지역변수
		// args : 지역변수
		int num = 0;
		boolean b = true;
		if(b) num =100;
		
		System.out.println(num);
		String grade="";
		int score = 80; // 지역변수
		switch(score/10) {
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F"; break;
		}
		System.out.println("학점 : " + grade);
		System.out.println("학점2 : " + grade2);
	}
}
