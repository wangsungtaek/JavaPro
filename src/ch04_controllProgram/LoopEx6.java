package ch04_controllProgram;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {
		
		int sum = 0;
		int cnt = 0;
		System.out.println("���ڸ� �Է��ϼ��� (���� : 99999)");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int num = scan.nextInt();
			if(num == 99999) break;
			cnt++;
			sum += num;			
		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (double)sum/cnt);
		
	}

}
