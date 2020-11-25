package ch07_Practice;

class Parent {
	
	Parent(String str) {
		System.out.println(str);
	}
}

class Child extends Parent {
	
	Child(String str){
		super("Parent 积己磊 角青");
		System.out.println(str);
	}
}


public class Test {
	
	public static void main(String[] args) {
		
		Child ch = new Child("Child 积己磊 角青");
		System.out.println("3");
	}
}
