package ch05_homework;

public class Ex3_Ladder_v1 {

	public static void main(String[] args) {
		char[][] baseArray = {
				{ '¦¢',' ','¦¢',' ','¦¢',' ','¦¢',' ','¦¢',' ','¦¢'},
				{ '¦¢',' ','¦¢',' ','¦¢',' ','¦¢',' ','¦¢',' ','¦¢'},
				{ '¦¢',' ','¦¢',' ','¦¢',' ','¦¢',' ','¦¢',' ','¦¢'},
				{ '¦¢',' ','¦¢',' ','¦¢',' ','¦¢',' ','¦¢',' ','¦¢'}, 
				{ '¦¢',' ','¦¢',' ','¦¢',' ','¦¢',' ','¦¢',' ','¦¢'}
		};
		char[] compare = {' ',' ',' ',' ',' '};
		char[] number = {'1','2','3','4','5','6'};
		
		int num = 0;
		char randomChar = ' ';
		int count = 0;
		char tmp = ' ';
	
		System.out.println("1 2 3 4 5 6");
	
		for(int i=1; i<=9; i+=2) {
			for (int j=0; j<baseArray.length-1; j++) {
				num = (int) (Math.random()*10)%2;
				randomChar = ((num == 0) ? ' ':'¦¡');
				
				if( compare[count] == randomChar &&  compare[count] == '¦¡') {
					baseArray[j][i] = ' ';
				} else if( compare[count] != '¦¡' ){
					baseArray[j][i] = randomChar;
				}	
				compare[count] = randomChar;
				count++;
			}
			count = 0;
		}
		for(int i=0; i<baseArray.length; i++) {
			for(int j=0; j<baseArray[i].length; j++) {
				System.out.print(baseArray[i][j]);
				if(baseArray[i][j] == '¦¡') {
					if(j==1) {
						tmp = number[0];
						number[0] = number[1];	
						number[1] = tmp;	
					} else if(j==3){
						tmp = number[1];
						number[1] = number[2];	
						number[2] = tmp;	
					} else if(j==5){
						tmp = number[2];
						number[2] = number[3];	
						number[3] = tmp;	
					} else if(j==7){
						tmp = number[3];
						number[3] = number[4];	
						number[4] = tmp;	
					} else if(j==9){
						tmp = number[4];
						number[4] = number[5];	
						number[5] = tmp;	
					}
				}
			}
			System.out.println();
		}
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
}
