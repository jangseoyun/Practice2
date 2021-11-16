package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
	//01. 코드 오류 수정
		
		/*---------------------------
		age가 0살 초과이고 18살 미만이면 청소년 출력
		if(0<age<18) { 자바에서는 식을 하나씩 표현할 수 있다.
			System.out.println("청소년 입니다.");
		}----------------------------*/
		
		int age = 15;
		
		if(age>0 && age<18) {
			System.out.println("청소년 입니다.");
		}
	}

}
