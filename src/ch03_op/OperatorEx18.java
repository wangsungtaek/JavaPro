package ch03_op;

public class OperatorEx18 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double a = Math.round(pi * 1000);
		double shorPi = a / 1000.0;
		
		System.out.println(a);
		System.out.println(shorPi);
	}
}
