package ch05_homework;

public class Exam7 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,11,3,8,12};
		
		max = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			} 
		}
		System.out.println("max : "+ max);
	}
}
