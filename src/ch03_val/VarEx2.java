package ch03_val;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte<short<int<long<float<double
		//     char
		//a=b 같다의 의미가 아니고, 대입의 의미. b의 값을 a에 대입 
		//lvalue : 대입연산자의 왼쪽의 값. 반드시 변수여야함.
		//rvalue : 대입연산자의 오른쪽 값. 변수, 리터럴, 수식 가능 
		
int a = 10;
// 1. 참조형과 기본형은 형변환 불가
String s = "a"; //"": 문자열, string,  '': 문자, char

s = 'a' + ""; // s = 'a' 불가.  참조형인 string, 기본형인 char 형변환 불가. string은 리터럴로 ""추가해서 바꿀수있음.
s = 10.5 + "";
s = a + "";
char c = 'a';

//2. 기본형 사이에 boolean 을 제외한 7개는 서로 형변환 가능
byte b1 = (byte) 128;
int i1 = b1; //int가 더크니까 자동현변환.
byte b2 = (byte) i1; //명시적 형변환
System.out.println("b1=" + b1 + ", i1=" +i1);
byte b3 = 100;
System.out.println("b3="+ b3);
long l1 = 10;
float f1 = l1;
long l2 = (long) f1;
char c1 = 'A';
short s1 = (short)c1;
char c2 = (char)b1;

int i2 = (int) (i1 + l1); //큰자료형 +작은 자료형 은 큰자료형 
//string = string + 기본자료형
System.out.println("번호:" + 1 + 2 + 3); //결과값은 번호:123 -> reducing? 
System.out.println(1 + 2+ 3 + "번"); //결과값은 6번 -> reducing
char c3 = 'A'; //아스키코드값 65
int i3 = c3; 
System.out.println("c3=" +c3 + ", i3=" + (char) i3);

//int 보다 작은 자료형의 연산결과는 int
int b4; byte b5 = 1; byte b6 = 2; 
b5 = (byte) (b5 + b6);// 연산결과 int 이고  b5는 byte 이니까 형변환.



 

	}

}
