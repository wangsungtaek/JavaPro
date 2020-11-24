package ch06_Test;

class Card {
	String kind;
	int number;
	
	static double width;
	static double height;

	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + ", width="
	+ width + ", height=" + height + "]";
	}
}

public class temp {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 1;
		System.out.println(c1);
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		System.out.println(c2);
	
		Card.width = 50;
		Card.height = 80;
		System.out.println(c1);
		System.out.println(c2);
	}
}
