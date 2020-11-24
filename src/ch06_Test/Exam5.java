package ch06_Test;

class Animal {
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name + ":" + this.age;
	}	
}

public class Exam5 {

	public static void main(String[] args) {
		Animal a = new Animal("¿ø¼þÀÌ",26);
		System.out.println(a);
	}
}
