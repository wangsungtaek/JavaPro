package ch05_Array;
/*
 *  Math.random() �Լ��� �̿��Ͽ� 1���� 10������ ������ ���� �迭�� 10�� �����ϱ�
 *  �迭�� ����� ����ŭ * ����ϱ�
 *  0 <= Math.random() < 1.0
 *  arr = {3,5,2,1,..}
 *  3:***
 *  5:*****
 *  2:**
 */ 
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		int[] num = new int[10];		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*10+1);
			System.out.print(arr[i]+" ");
			num[arr[i]-1]++;
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(num[i]>0) {
				System.out.print(i+1+":");
				for(int j=0; j<num[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
