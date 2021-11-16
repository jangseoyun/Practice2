package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
////////////////분모 0인경우 계산  0일때는 아예 나누기를 못하도록 설정
	public static void main(String[] args) {
	//12. 계산기 프로그램
	/*
	기호, 숫자1, 숫자2 순서로 입력받는다.
	기호는 ( + - * / ) 4가지 입니다.
 	입력된 내용으로 계산하여 결과갑슬 출력합니다.
 	나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다.
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String input = sc.next();
		
		System.out.print("숫자1: ");
		float num1 = sc.nextFloat();
		
		System.out.print("숫자2: ");
		float num2 = sc.nextFloat();
		
		switch(input) {
			case "+" :
				System.out.println("결과는: "+(num1+num2));
				break;
			case "-":
				System.out.println("결과는: "+(num1-num2));
				break;
			case "*" :
				System.out.println("결과는: "+(num1*num2));
				break;
			case "/":
				if(num2==0) {
					System.out.println("계산할 수 없습니다.");
				}else if(num2>0) {
					System.out.println("결과는: "+(num1/num2));
				}
				break;
			default :
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
		
		sc.close();
		
	}

}
