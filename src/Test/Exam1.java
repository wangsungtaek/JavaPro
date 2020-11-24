package Test;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2};
		solution(a);
	}

	public static int[] solution(int[] numbers) {
		int[] answer = {};
		int sum = 0;
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<(numbers.length-1); j++) {
				sum = numbers[i] + numbers[i+j];		
			}
		}
		return answer;
	}
}
