package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
	//11. 알파벳을 입력받아 자음 모음 구분
	//switch ~ case문을 사용, 영문 소문자 이외의 입력값은 고려히지 않음.
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String text = sc.nextLine();
		
		switch(text) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("모음입니다.");
				break;
			default:
				System.out.println("자음입니다.");
		}
		
		sc.close();
	}
		/* if else문으로
		 if (text=="a" || text=="e" || text=="i" || text=="o" || text=="u") {
			System.out.println("모음입니다.");
		}else {
			System.out.println("자음입니다.");
		}
		*/

}
