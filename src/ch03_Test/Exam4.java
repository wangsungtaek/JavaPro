package ch03_Test;

public class Exam4 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
		
	}
}
