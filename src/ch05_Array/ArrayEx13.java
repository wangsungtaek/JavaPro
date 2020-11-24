package ch05_Array;

public class ArrayEx13 {

	public static void main(String[] args) {
		int score1[] = {90,80,70};
		int score2[] = new int[5];
		System.arraycopy(score1, 1, score2, 2, score1.length-1);
		for(int s :score2 ) {
			System.out.println(s);
		}
	}

}
