package ch04_controllProgram;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		System.out.println("����Ʈ�� �Է��ϼ���(1 ~1000) exit(9999)");
		Scanner scan = new Scanner(System.in);
		int point = 0;
		
		while(true) {
			point = scan.nextInt();
			if(point == 9999) {
				System.out.println("Exit");
				break;
			}
			System.out.println(point + "��");
			switch(point/200) {
			case 0 : System.out.println("��ǰ�� �����ϴ�.");
			break;
			case 4 : System.out.println("����Ʈ,");
			case 3 : System.out.println("�ڵ���,");
			case 2 : System.out.println("�ڵ���,");
			case 1 : System.out.println("�����");

			}
			
		}
	}

}
