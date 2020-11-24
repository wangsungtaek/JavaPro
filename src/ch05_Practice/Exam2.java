package ch05_Practice;

public class Exam2 {

	public static void main(String[] args) {

		int[] randomNumber = new int[10];
		int[] number = new int[10];
		
		for(int i=0; i<randomNumber.length; i++) {
			randomNumber[i] = (int) (Math.random() * 10 +1);
			number[randomNumber[i]-1]++;
			System.out.print(randomNumber[i]);
		}
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		System.out.println(number[5]);
		System.out.println(number[6]);
		System.out.println(number[7]);
		System.out.println(number[8]);
		System.out.println(number[9]);
		
		
	}

}
