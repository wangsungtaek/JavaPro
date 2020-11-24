package ch05_homework;

public class Exam8 {

	public static void main(String[] args) {
		int[][] arry = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i=0; i<arry.length; i++) {
			for(int j=0; j<arry[i].length; j++) {
				sum += arry[i][j];
				count++;
			}
		}
		
		avg = (double)sum/count;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
