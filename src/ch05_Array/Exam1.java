package ch05_Array;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];

		int sum = 0;
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		System.out.println("5���� ������ �Է��ϼ���.");

		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			sum += score[i];
			if (max < score[i])
				max = score[i];
			if (min > score[i])
				min = score[i];
		}

		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (double) sum / score.length);
		System.out.println("�ִ����� : " + max);
		System.out.println("�ּ����� : " + min);
	}

}

/*
 * for(int i=0; i<score.length; i++) { score[i] = scan.nextInt(); sum +=
 * score[i]; }
 * 
 * min = score[0]; max = score[0];
 * 
 * for(int i=1; i<score.length; i++) { if(min>score[i]) min = score[i];
 * if(max<score[i]) max = score[i]; }
 */

/*
 * 
 * 
 * 
 * 
 * for(int i=0; i<score.length; i++) { score[i] = scan.nextInt(); sum +=
 * score[i]; if(max<score[i]) max = score[i]; if(min == 0) { min = score[i]; }
 * else if(min>score[i]) min = score[i]; }
 * 
 */