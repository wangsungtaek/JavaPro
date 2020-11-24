package ch04_controllProgram;

public class Exam7 {

	public static void main(String[] args) {
		int sum  = 0;
		int sum2 = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0 | i%3 == 0) {
				sum += i;
			} else { 
				sum2 += i;
			}
		
		}
		System.out.println("2의 배수 or 3의 배수 = " + sum);
		System.out.println("2의 배수 or 3의 배수 != " + sum2);
		System.out.println("sum + sum2 = " + (sum+sum2));
	}
}
