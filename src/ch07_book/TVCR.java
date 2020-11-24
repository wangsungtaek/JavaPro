package ch07_book;

class Tv2 {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class VCR {
	boolean power;
	int counter = 0;
	void power() { power = !power; }
	void play() { }
	void stop() { }
	void rew() { }
	void ff() { }
	
}


public class TVCR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
