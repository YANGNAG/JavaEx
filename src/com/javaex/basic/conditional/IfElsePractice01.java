package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice01 {
	
	public static void main(String[] args) {
		
		Scanner scanner : new Scanner(System.in);
		System.out.println("숫자입력");
		int num = scanner.nextInt();
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + result + "입니다");
		
		if (num % 2) = 0; {
		System.out.println("짝수입니다.");
		} else {
	    (num % 2) = 0!;
		System.out.println("홀수입니다.");
		
		}
	}

}
