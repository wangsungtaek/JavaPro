package ch05_Array;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];

		int sum = 0;
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		System.out.println("5개의 점수를 입력하세요.");

		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			sum += score[i];
			if (max < score[i])
				max = score[i];
			if (min > score[i])
				min = score[i];
		}

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double) sum / score.length);
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);
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