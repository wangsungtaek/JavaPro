package ch03_val;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte<short<int<long<float<double
		//     char
		//a=b ������ �ǹ̰� �ƴϰ�, ������ �ǹ�. b�� ���� a�� ���� 
		//lvalue : ���Կ������� ������ ��. �ݵ�� ����������.
		//rvalue : ���Կ������� ������ ��. ����, ���ͷ�, ���� ���� 
		
int a = 10;
// 1. �������� �⺻���� ����ȯ �Ұ�
String s = "a"; //"": ���ڿ�, string,  '': ����, char

s = 'a' + ""; // s = 'a' �Ұ�.  �������� string, �⺻���� char ����ȯ �Ұ�. string�� ���ͷ��� ""�߰��ؼ� �ٲܼ�����.
s = 10.5 + "";
s = a + "";
char c = 'a';

//2. �⺻�� ���̿� boolean �� ������ 7���� ���� ����ȯ ����
byte b1 = (byte) 128;
int i1 = b1; //int�� ��ũ�ϱ� �ڵ�����ȯ.
byte b2 = (byte) i1; //����� ����ȯ
System.out.println("b1=" + b1 + ", i1=" +i1);
byte b3 = 100;
System.out.println("b3="+ b3);
long l1 = 10;
float f1 = l1;
long l2 = (long) f1;
char c1 = 'A';
short s1 = (short)c1;
char c2 = (char)b1;

int i2 = (int) (i1 + l1); //ū�ڷ��� +���� �ڷ��� �� ū�ڷ��� 
//string = string + �⺻�ڷ���
System.out.println("��ȣ:" + 1 + 2 + 3); //������� ��ȣ:123 -> reducing? 
System.out.println(1 + 2+ 3 + "��"); //������� 6�� -> reducing
char c3 = 'A'; //�ƽ�Ű�ڵ尪 65
int i3 = c3; 
System.out.println("c3=" +c3 + ", i3=" + (char) i3);

//int ���� ���� �ڷ����� �������� int
int b4; byte b5 = 1; byte b6 = 2; 
b5 = (byte) (b5 + b6);// ������ int �̰�  b5�� byte �̴ϱ� ����ȯ.



 

	}

}
