package ch06_book;
class Tv {
	// Tv의 속성 (멤버변수)
	String color ;
	boolean power;
	int channel;
	
	void power( ) { power = !power; }
	void channelUp( ) { ++channel; }
	void channelDown( ) { --channel; }
	
}

public class TvTest2 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channl1값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channl1값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channl1값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channl1값은 " + t2.channel + "입니다.");
	}

}
