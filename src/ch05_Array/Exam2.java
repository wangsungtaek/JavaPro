package ch05_Array;
/*
 *  Math.random() 함수를 이용하여 1부터 10까지의 임의의 수를 배열에 10개 저장하기
 *  배열에 저장된 수만큼 * 출력하기
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
