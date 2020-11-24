package ch04_controllProgram;

import java.util.Scanner;

public class SwitchEx2 {
	public static void main(String[] args) {
			
		int i = 1;
		byte b = 2;
		String str = "a";
		char c = 'a';
		
		switch(i) {
			case 1 : System.out.println(i);
			break;
			case 2 : System.out.println(i);
			break;
			default  : System.out.println(i);
			break;
		}
		
		switch(b) {
			case 1 : System.out.println(b);
			break;
			case 2 : System.out.println(b);
			break;
			default  : System.out.println(b);
			break;
		}
		
		switch(str) {
			case "a" : System.out.println(str);
			break;
			case "b" : System.out.println(str);
			break;
			
			default  : System.out.println(str);
			break;
		}
		
		switch(c) {
			case 'a' : System.out.println(c);
			break;
			case 'b' : System.out.println(c);
			break;
			default  : System.out.println(c);
			break;
		}
	}
}
