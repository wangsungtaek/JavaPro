package ch04_Test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String a ="";
		String b ="";
		
		//Ȧ��
		if((str.length()%2) != 0) {
			for(int i=0; i<(str.length()/2); i++) {
				a += str.charAt(i);
			}
			for(int j=(str.length()-1); (str.length()/2) <j; j--) {
				b += str.charAt(j);
			}
		} else {
			for(int i=0; i<(str.length()/2); i++) {
				a += str.charAt(i);
			}
			for(int j=(str.length()-1); (str.length()/2) <= j; j--) {
				b += str.charAt(j);
			}	
		}
		if(a.equals(b)) {
			System.out.println("�¿��Ī");
		} else {
			System.out.println("�¿��Ī�ƴ�");
		}
	}
}
