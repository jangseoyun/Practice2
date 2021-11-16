package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	//07. 두개의 정수를 받아 큰수를 작은수로 나눈 몫과 나머지 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("몫: "+num1/num2);
			System.out.println("나머지: "+num1%num2);
		}else {
			System.out.println("몫: "+num2/num1);
			System.out.println("나머지: "+num2%num1);
		}
		
		sc.close();
		
	}

}
