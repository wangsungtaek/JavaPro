package ch05_Array;

public class Exam10 {

	public static void main(String[] args) {
		
		int score[][] = {
				{100,80,90},
				{80,95,100},
				{60,65,70},
				{85,70,75},
				{90,90,80}
		};
		int total[] = new int[3];
		int studentTotalScore = 0;
		double studentAverage = 0.0;
		int subjectTotlaScore = 0;
		double subjectAverage = 0.0;
		
		
		System.out.print("\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println();

		for(int i=0; i<score.length; i++) {
			System.out.print(i + "번학생 :\t");
			studentTotalScore = 0;
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				studentTotalScore += score[i][j];
				total[j] += score[i][j];
			}
			System.out.printf("%d \t %.2f \n", studentTotalScore, (double)studentTotalScore/score[i].length);
			
		}
		
		System.out.print("과목총점 :\t");
		for(int i=0; i<total.length; i++) {
			System.out.print(total[i] + "\t");
		}
		System.out.println();
		System.out.print("과목평균 :\t");
		for(int i=0; i<total.length; i++) {
			System.out.printf("%.2f \t", (double)total[i]/score.length);
		}
	}
}

