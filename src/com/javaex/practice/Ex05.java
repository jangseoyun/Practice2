package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	//05. 사용자로 키와 몸무게를 입력받아 표준체중을 계산한 후 저체중, 표준, 과체중을 구분 출력
	//표준체중 계산 (키-100)*0.9	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		
		System.out.print("키: ");
		int height = sc.nextInt();
		
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
		
		float std = (height-100)*0.9f;
		
		if(weight>std) {
			System.out.println("과체중 입니다.");
		}else if (weight<std) {
			System.out.println("저체중 입니다.");
		}else {
			System.out.println("표준 입니다.");
		}
		
		System.out.println("표준체중: "+std);

		sc.close();
		
	}

}
