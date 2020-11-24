package ch05_homework;

import java.util.Scanner;

public class Ex3_Ladder_v2 {

	public static void main(String[] args) {
		// 
		System.out.println("유저수를 입력하세요.(2~12)");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt() ;
		if(user < 2 | user > 12) {
			System.out.println("유저 설정이 잘못 되었습니다.");
			return;
		}

		int row = 7;
	
		String[][] baseArray = new String[row][user*2-1];	// base
		String[] usersNumber = new String[user*2];		// users
		
		int randomValue = 0;
		int userValue = 0;
		String compare = "";
		String changeUser = "";
		
		//
		for(int i=0; i<usersNumber.length; i++) {
			if(i%2 == 0) {
				usersNumber[i] = Integer.toString(++userValue);
			} else {
				
				usersNumber[i] = (i >= 17)? "    " : "     ";
			}
			System.out.print(usersNumber[i]);
		}
		System.out.println();
			
		
		for(int i=0; i<baseArray.length; i++) {
			for(int j=0; j<baseArray[i].length; j++) {
				if(j%2 != 0) {	
					randomValue = (int)(Math.random()*10+1);
					if(randomValue % 2 == 0) { 
						if(compare == "─────") {
							baseArray[i][j]= "     ";
						} else {
							baseArray[i][j]= "─────";
							changeUser=usersNumber[j+1];
							usersNumber[j+1]=usersNumber[j-1];
							usersNumber[j-1]=changeUser;
						}
					} else {
						baseArray[i][j]= "     ";
					}
					compare = baseArray[i][j];
				} else {
					baseArray[i][j]= "│";
				}
				System.out.print(baseArray[i][j]);
			}
			System.out.println();
		}
		for(int i=0; i<usersNumber.length; i++) {
			System.out.print(usersNumber[i]);
		}
	}
}





