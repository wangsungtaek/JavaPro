package ch05_homework;

public class Exam7_1 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {14,2,13,8,12};
		
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			} 
		}
		System.out.println("max : "+ max);
	}
}
