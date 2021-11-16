package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	//03. 코드를 실행한 후 결과 값 예상 
		//나이가 20살 초과이면 "1번그룹" 입니다. 출력 20살부터~0살까지 "2번그룹" 입니다. 출력 
		
		//예상 = 21,100 : 1번그룹   20,15,19 : 2번그룹
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age>20) {
			System.out.println("\"1번그룹\""); 
		}else {
			System.out.println("\"2번그룹\"");
		}System.out.println("입니다.");
		
		sc.close();
		
	}

}
