package ch07_OOP2;
/*
 *  �߻� Ŭ�������� ��ӵ� ������.
 *  �߻�Ŭ������ �ڼ� Ŭ������ ��� �θ��� �߻� �޼��带 �������� �ʾƵ� ��.
 *  �� �߻� Ŭ������ ��ӹ��� �Ϲ� Ŭ������ ��� �߻� �޼��带 �����ؾ� ��.
 */
abstract class Abs1 { int a = 10; protected abstract int getA(); }
abstract class Abs2 extends Abs1 { 
	int b = 20;
	protected abstract int getB();
}
class Normal extends Abs2 {
	protected int getB() {	return b; }
	protected int getA() {	return a; }	
}

public interface AbstractEx1 {
	public static void main(String[] args) {
		Abs1 a1 = new Normal();
		System.out.println(a1.getA());
//		System.out.println(a1.getB());	// error.getB() ����� Ans1�� ����� �ƴ�
		Abs2 a2 = (Abs2) a1;
		System.out.println(a2.getA());
		System.out.println(a2.getB());
		Normal n = (Normal) a2;
		System.out.println(n.getA());
		System.out.println(n.getB());
//		a2 = new Abs();	// error. �߻�Ŭ������ ��üȭ �Ұ�.
	}
}
