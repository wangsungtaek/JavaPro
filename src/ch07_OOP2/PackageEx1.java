package ch07_OOP2;

import java.util.Date;

/*
 * package : Ŭ�������� ����.
 * 		Ŭ�����̸��� ��Ű������ �����Ѵ�.
 * 		package ������ ������ ó���� �ѹ��� ������ �����ϴ�.
 * 		=> �ϳ��� ���Ͽ� �ִ� ��� Ŭ������ ���� ��Ű���� ���� Ŭ������.
 * 
 * import : ��Ű������ ������ �� �ֵ��� �̸� ���� Ŭ������ ��Ű���� �����ϴ� ����.
 * 
 * Ŭ������ �̸��� ������ �� �ִ� ���
 * 		1. ���� ��Ű���� ���� Ŭ������ ��Ű������ ���� ������.
 * 		2. java.lang ��Ű���� ���� Ŭ�������� ��Ű������ ���� ������.
 * 		3. import �������� ������ Ŭ������ ��Ű���� ���� ����.
 * 
 */
class Pack1 {
	void method() {
		System.out.println("Pack1.method() ȣ���");
	}
}

public class PackageEx1 {
	
	public static void main(String[] args) {
		Pack1 p1 = new Pack1();
		p1.method();
		ch01.sist.com.Pack2 p2 = new ch01.sist.com.Pack2();
		p2.method();
		Date d = new Date();
	}
}