package ch07_book;

class Tv {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv {
	boolean caption;
	void displayCaptions(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class TvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaptions("Hello, World");
		ctv.caption = true;
		ctv.displayCaptions("Hello. World");
	}

}
