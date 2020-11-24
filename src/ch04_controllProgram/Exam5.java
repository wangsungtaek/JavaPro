package ch04_controllProgram;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // 123, 12, 11, 0
		
		int sum = 0;
		int value = num;
		


		System.out.println(sum);
		sum = 0;
		
		for(value=num; value!=0; value/=10) {
			sum += value%10;
		}
		System.out.println(sum);
		sum+=value;
		System.out.println(sum);
	}
}
/*			
int a = num/1000;
int b = (num%1000)/100;
int c = (num%100)/10;
int d = (num%100)%10;
System.out.println(a+b+c+d);
*/