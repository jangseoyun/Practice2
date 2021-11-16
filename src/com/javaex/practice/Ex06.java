package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	//06. 두개의 숫자를 받아 큰수와 작은수 분류 후 출력
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");
		
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.print("큰수: "+num1+"\t\t"+"작은수: "+num2+"입니다.");
		}else {
			System.out.println("큰수: "+num2+"\t\t"+"작은수: "+num1+"입니다.");
		}
		
		sc.close();
	}

}
