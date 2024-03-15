package com.javaex.basic.operate;

public class CondOperEx {

	public static void main(String[] args) {
		int a = 10;
		
		// a가 짝수면 짝수, 홀수면 홀수 출력
		String result = a % 2 == 0 ? "짝수": "홀수";
		System.out.println(a + result + "입니다");
		
		int score = 70;
		String message;
		
		// score 가 80 이상 : Good
		// score 가 50 ~ 80 : Pass
		// score 가 50 미만 : Fail
		
		message = score >= 80 ? "Good":
					score >= 50 ? "pass": "Fail";
		System.out.println(message);

	}

}
