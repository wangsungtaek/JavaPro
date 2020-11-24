package ch05_Array;

public class ch06_array {

	public static void main(String[] args) {
		int score[] = {90,80,70};
		int score2[] = new int[5];
		System.arraycopy(score, 0, score2, 2, score.length);
		for(int s : score2 ) {
			System.out.println(s);
		}
	}

}
