package ch03_op;
/*
 *  ������ ������ : !
 */

public class OpEx4 {

	public static void main(String[] args) {
		System.out.println(true);
		System.out.println("!true = "+!true);
		System.out.println("!False = "+!false);
		int x = 100;
		System.out.println("(x <200) = " + (x <200));
		System.out.println("!(x <200) = " + !(x <200));
		System.out.println("!(5 % 2 == 0) = " + !(5 % 2 == 0));
		System.out.println("(5 % 2 != 0) = " + (5 % 2 != 0));
	}
}
