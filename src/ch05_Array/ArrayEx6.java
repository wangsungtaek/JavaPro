package ch05_Array;
/*
 *  command ���ο��� �Ķ���� �ޱ�
 *  ..../src>javac temp/exam01.java
 *  Exam01.class�� ��ġ�� temp������ ����
 *  ������
 *  java temp.Exam1 aaa aaaa bbb ������ �ȴ�.
 */


public class ArrayEx6 {

	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length == 0) {
			System.out.println("Ŀ�ǵ���ο� �Ķ���͸� �Է��ϼ���.");
			System.out.println("Java chap6.ArrayEx6 ȫ�浿 ���");
			return;
		}
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] " + args[i]);
		}
	}
}
