package ch07_OOP2;
/*
 *  다형성 예제
 */
public class BikeEx2 {

	public static void main(String[] args) {
		AutoBike auto1 = new AutoBike(2);
		AutoBike auto2;
		Bike bike;
		auto1.power();
		System.out.println(auto1.drive());
		System.out.println("바퀴" + auto1.wheel + " 개가 굴러간다.");
		System.out.println(auto1.stop());
		bike = auto1;	// 주소는 하나임 bike는 bike 클레스만 보겠다.
		//bike.power();
		System.out.println("========");
		System.out.println(bike.drive());
		auto2 = (AutoBike)bike;
		auto2.power();
		System.out.println(auto2.drive());
		System.out.println(auto2.stop());
	}

}