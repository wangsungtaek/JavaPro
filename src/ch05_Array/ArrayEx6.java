package ch05_Array;
/*
 *  command 라인에서 파라미터 받기
 *  ..../src>javac temp/exam01.java
 *  Exam01.class의 위치는 temp폴더에 있음
 *  실행은
 *  java temp.Exam1 aaa aaaa bbb 실행이 된다.
 */


public class ArrayEx6 {

	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length == 0) {
			System.out.println("커맨드라인에 파라미터를 입력하세요.");
			System.out.println("Java chap6.ArrayEx6 홍길동 김삿갓");
			return;
		}
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] " + args[i]);
		}
	}
}
