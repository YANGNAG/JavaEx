package com.javaex.baisc.loop;

public class ContinueEx {
	// 1 ~ 20까지 루프
	// 2의 배수와, 3의 배수는 출력안함.
	// 나머지는 출력
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i += 1) {
			if (i % 2 == 0 || i % 3 == 0)
				continue; // 다음 루프로
			System.out.println(i);
		}
		

	}

}
