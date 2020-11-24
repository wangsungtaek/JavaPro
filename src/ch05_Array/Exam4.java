package ch05_Array;

	// 큰 수 정렬예제

public class Exam4 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int temp = 0;
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 100 + 1);
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length -1 -i; j++) {
				if(num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + ",");
		}
	}

}
