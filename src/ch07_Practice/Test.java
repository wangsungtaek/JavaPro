package ch07_Practice;

class Parent {
	
	Parent(String str) {
		System.out.println(str);
	}
}

class Child extends Parent {
	
	Child(String str){
		super("Parent ������ ����");
		System.out.println(str);
	}
}


public class Test {
	
	public static void main(String[] args) {
		
		Child ch = new Child("Child ������ ����");
		System.out.println("3");
	}
}
