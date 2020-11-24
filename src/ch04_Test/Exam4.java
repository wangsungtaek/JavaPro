package ch04_Test;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ran1 = 0;
		int ran2 = 0;
		int result = 0;
		
		
		while(true) {
			ran1 = (int)((Math.random()*5)+1);
			ran2 = (int)((Math.random()*5)+1);
			
			System.out.println("(" + ran1 + "," + ran2 + ")");
			
			if((ran1 + ran2) == 5) {
				break;
			}
		}
	}
}
