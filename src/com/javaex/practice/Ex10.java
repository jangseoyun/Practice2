package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	//10. 사번(양의정수)을 입력하면 팀을 확인할 수 있는 프로그램
	//팀 A B C / 사번을 3으로 나누어 나머지 0 A, 1 B, 2 C
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		
		System.out.print("사번: ");
		int num = sc.nextInt();
		
		if(num%3==0) {
			System.out.println("A팀입니다.");
		}else if(num%3==1) {
			System.out.println("B팀입니다.");
		}else if(num%3==2){
			System.out.println("C팀입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		sc.close();
		
	}

}
