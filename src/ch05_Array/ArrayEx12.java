package ch05_Array;

public class ArrayEx12 {

	public static void main(String[] args) {
		int score1[] = {90,80,70};
		// score1.length = 5; // error. 배열의 크기는 변경할 수 없음.
	
		int score2[] = new int[5];
		for(int i=0; i<score1.length; i++) {
			score2[i] = score1[i];
		}
		for(int s : score2) {
			System.out.println(s);
		}
	}

}
