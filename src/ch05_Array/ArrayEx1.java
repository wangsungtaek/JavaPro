package ch05_Array;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 1. �迭 ���� ���� ����
		int[] arr1;	int arr2[];
		
		// 2. �迭 ��ü ����
		arr1 = new int[5];	// 100
		arr2 = new int[5];	// 200
		// int�� ��������� 5�� ����. �⺻��(0)���� �ʱ�ȭ
		
		// 3. �迭���� �ʱ�ȭ
		arr1[0] = 10;	arr1[1] = 20;	arr1[2] = 30;
		arr2 = arr1; // (�ּҰ� ������)j
		arr2[4] = 50;
		
		// 4. �迭 ���
		System.out.println("arr1 �迭 : ");
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1[" + i + "]=" + arr1[i]); 
		}
		System.out.println("arr2 �迭 : ");
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]); 
		}
		System.out.println("������ for ������ �̿��� ���");
		// ������ for ����
		for(int a : arr1) {
			System.out.println(a);
		}	
	}
}
