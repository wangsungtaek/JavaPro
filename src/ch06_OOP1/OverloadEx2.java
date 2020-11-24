package ch06_OOP1;

class Math4 {
	int add(int a, int b) {
		System.out.print("int, int Result : ");
		return a + b;
	}
	long add(long a, int b) {
		System.out.print("long, int Result : ");
		return a + b;
	}
	long add(int a, long b) {
		System.out.print("int, long Result : ");
		return a + b;
	}
	long add(long a, long b) {
		System.out.print("long, long Result : ");
		return a + b;
	}
}

public class OverloadEx2 {

	public static void main(String[] args) {
		Math4 m = new Math4();
		System.out.println(m.add(10, 10));
		System.out.println(m.add(10, 10L));
		System.out.println(m.add(10L, 10));
		System.out.println(m.add(10L, 10L));
	}

}
