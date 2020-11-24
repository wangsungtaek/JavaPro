package ch06_OOP1;

public class StackEx01 {

	public static void main(String[] args) {

		System.out.println("main start");
		method1();
		System.out.println("---method1 end");
		method3();
		System.out.println("---method3 end");
		method4();
		System.out.println("---method4 end");
		System.out.println("main end");
	}
	public static void method1() {
		System.out.println("method1");
		method2();
	}
	public static void method2() {
		System.out.println("method2");
	}	
	public static void method3() {
		System.out.println("method3");
	}	
	public static void method4() {
		System.out.println("method4");
	}	
	
}
