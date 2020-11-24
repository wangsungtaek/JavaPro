package ch05_Array;
	// commend 약수 계산
import java.util.Scanner;
	
public class Exam7 {

	public static void main(String[] args) {
	
		for(String a : args) {
			int num = Integer.parseInt(a);
			System.out.print(num + "한글: ");
			for(int i=1; i<=num; i++) {
				if(num % i == 0) {
					System.out.print(i + ", ");
				}
			}
			System.out.println();
		}
	}
}